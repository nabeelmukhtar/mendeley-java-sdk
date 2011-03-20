/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.mendeley.oapi.services.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.schema.SchemaEntity;
import com.mendeley.oapi.services.AsyncResponseHandler;
import com.mendeley.oapi.services.MendeleyCommunicator;
import com.mendeley.oapi.services.MendeleyException;
import com.mendeley.oapi.services.MendeleyService;
import com.mendeley.oapi.services.constant.ApplicationConstants;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class BaseMendeleyPublicService.
 */
public abstract class BaseMendeleyPublicService extends MendeleyApiGateway implements MendeleyService, MendeleyCommunicator {
	
	/** The Constant UTF_8_CHAR_SET. */
	protected static final Charset UTF_8_CHAR_SET = Charset.forName(ApplicationConstants.CONTENT_ENCODING);
	
    /** The parser. */
    private final JsonParser parser = new JsonParser();
    
    /** The handlers. */
    private List<AsyncResponseHandler<List<? extends SchemaEntity>>> handlers = new ArrayList<AsyncResponseHandler<List<? extends SchemaEntity>>>();
    
	/** The api consumer. */
	protected MendeleyApiConsumer apiConsumer;
    
	/**
	 * Instantiates a new base mendeley public service.
	 * 
	 * @param apiConsumer the api consumer
	 */
	public BaseMendeleyPublicService(MendeleyApiConsumer apiConsumer) {
		this.apiConsumer = apiConsumer;
        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.MendeleyCommunicator#setApiConsumer(com.mendeley.oapi.services.oauth.MendeleyApiConsumer)
	 */
	@Override
	public void setApiConsumer(MendeleyApiConsumer apiConsumer) {
		this.apiConsumer = apiConsumer;
		requestParameters.put("", apiConsumer.getConsumerKey());
	}
	
	/**
	 * Unmarshall.
	 * 
	 * @param typeToken the type token
	 * @param response the response
	 * 
	 * @return the t
	 */
	@SuppressWarnings("unchecked")
	protected <T> T unmarshall(TypeToken<T> typeToken, JsonElement response) {
		Gson gson = getGsonBuilder().create();
		return (T) gson.fromJson(response, typeToken.getType());
	}

	/**
	 * Notify observers.
	 * 
	 * @param response the response
	 */
	protected void notifyObservers(List<? extends SchemaEntity> response) {
		for(AsyncResponseHandler<List<? extends SchemaEntity>> handler : handlers) {
			handler.handleResponse(response);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackExchangeApiQuery#addResonseHandler(com.google.code.stackexchange.client.AsyncResponseHandler)
	 */
	/**
	 * Adds the resonse handler.
	 * 
	 * @param handler the handler
	 */
	public void addResonseHandler(AsyncResponseHandler<List<? extends SchemaEntity>> handler) {
		handlers.add(handler);
	}
	
	/**
	 * Gets the gson builder.
	 * 
	 * @return the gson builder
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		builder.setDateFormat(ApplicationConstants.DATE_FORMAT);
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//		builder.registerTypeAdapter(Issue.State.class, new JsonDeserializer<Issue.State>() {
//			@Override
//			public Issue.State deserialize(JsonElement arg0, Type arg1,
//					JsonDeserializationContext arg2) throws JsonParseException {
//				return Issue.State.fromValue(arg0.getAsString());
//			}
//		});
		return builder;
	}
	
	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.impl.MendeleyApiGateway#signRequest(java.net.HttpURLConnection)
	 */
	protected void signRequest(HttpURLConnection request) {
	}
	
    
	/**
	 * Unmarshall.
	 * 
	 * @param jsonContent the json content
	 * 
	 * @return the json object
	 */
	protected JsonObject unmarshall(InputStream jsonContent) {
        try {
        	JsonElement element = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (element.isJsonObject()) {
        		return element.getAsJsonObject();
        	} else {
        		throw new MendeleyException("Unknown content found in response." + element);
        	}
        } catch (Exception e) {
            throw new MendeleyException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/**
	 * Creates the mendeley api url builder.
	 * 
	 * @param urlFormat the url format
	 * 
	 * @return the mendeley api url builder
	 */
	protected MendeleyApiUrlBuilder createMendeleyApiUrlBuilder(String urlFormat) {
		return new MendeleyApiUrlBuilder(urlFormat);
	}
	
	protected String toString(String[] terms) {
		StringBuilder builder = new StringBuilder();
		for (String term : terms) {
			builder.append(term);
			builder.append(" ");
		}
		return builder.toString();
	}
}
