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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.common.PagedList;
import com.mendeley.oapi.schema.Collection;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.schema.Collection.MembershipType;
import com.mendeley.oapi.services.SharedCollectionService;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class SharedCollectionServiceImpl.
 */
public class SharedCollectionServiceImpl extends BaseMendeleyPrivateService implements
		SharedCollectionService {

	/**
	 * Instantiates a new shared collection service impl.
	 * 
	 * @param apiConsumer the api consumer
	 * @param accessToken the access token
	 */
	public SharedCollectionServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#addDocumentToCollection(java.lang.String, java.lang.String)
	 */
	@Override
	public String addDocumentToCollection(String collectionId, String documentId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.ADD_DOCUMENT_TO_COLLECTION_URL);
        String                apiUrl  = builder.withField(ParameterNames.COLLECTION_ID, collectionId).withField(ParameterNames.DOCUMENT_ID, documentId).buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        JsonElement json = unmarshall(callApiPost(apiUrl, parameters));
        return unmarshall(new TypeToken<String>(){}, json);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#createCollection(java.lang.String)
	 */
	@Override
	public Collection createCollection(String name) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.CREATE_COLLECTION_URL);
        String                apiUrl  = builder.buildUrl();
        Collection collection = new Collection();
        // TODO-NM: Populate collection
        JsonElement json = unmarshall(callApiMethod(apiUrl, getGsonBuilder().create().toJson(collection), "application/json", "POST", 201));
        return unmarshall(new TypeToken<Collection>(){}, json);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#getCollectionDocuments(java.lang.String)
	 */
	@Override
	public PagedList<String> getCollectionDocuments(String collectionId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.GET_COLLECTION_DOCUMENTS_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, collectionId).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshallList(String.class, json, "document_ids");
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#getCollectionDocuments(java.lang.String, int, int)
	 */
	@Override
	public PagedList<String> getCollectionDocuments(String collectionId,
			int page, int itemsPerPage) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.GET_COLLECTION_DOCUMENTS_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, collectionId).withParameter(ParameterNames.PAGE, String.valueOf(page)).withParameter(ParameterNames.ITEMS, String.valueOf(itemsPerPage)).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshallList(String.class, json, "document_ids");
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#getCollectionMembers(java.lang.String)
	 */
	@Override
	public Map<MembershipType, List<User>> getCollectionMembers(
			String collectionId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#getCollections()
	 */
	@Override
	public List<Collection> getCollections() {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.GET_COLLECTIONS_URL);
        String                apiUrl  = builder.buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshallList(Collection.class, json);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#removeCollection(java.lang.String)
	 */
	@Override
	public void removeCollection(String collectionId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.REMOVE_COLLECTION_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, collectionId).buildUrl();
        callApiDelete(apiUrl, 204);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#removeDocumentFromCollection(java.lang.String, java.lang.String)
	 */
	@Override
	public void removeDocumentFromCollection(String collectionId,
			String documentId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.SharedCollectionApiUrls.REMOVE_DOCUMENT_FROM_COLLECTION_URL);
        String                apiUrl  = builder.withField(ParameterNames.COLLECTION_ID, collectionId).withField(ParameterNames.DOCUMENT_ID, documentId).buildUrl();
        callApiDelete(apiUrl, 204);
	}
}
