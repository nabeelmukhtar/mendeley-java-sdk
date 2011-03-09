/*
 * Copyright 2010 Nabeel Mukhtar 
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

import java.util.Set;
import java.util.regex.Matcher;

import com.mendeley.oapi.services.MendeleyException;
import com.mendeley.oapi.services.OAuthService;
import com.mendeley.oapi.services.constant.ApplicationConstants;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;

/**
 * The Class OAuthServiceImpl.
 */
public class OAuthServiceImpl extends BaseMendeleyService implements OAuthService {

    /** The client id. */
    private final String clientId;
    
    /** The secret. */
    private final String secret;

    /**
	 * Instantiates a new o auth service impl.
	 * 
	 * @param clientId
	 *            the client id
	 * @param secret
	 *            the secret
	 */
    public OAuthServiceImpl(String clientId, String secret) {
    	this.clientId = clientId;
    	this.secret = secret;
    }
    
    /* (non-Javadoc)
     * @see com.google.code.facebook.graph.client.oauth.FacebookOAuthService#getAuthorizationUrl(java.lang.String)
     */
    @Override
	public String getAuthorizationUrl(String callBackUrl) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.OAuthUrls.AUTHORIZE_URL);
		builder.withParameter(ParameterNames.CLIENT_ID, clientId).withParameter(ParameterNames.REDIRECT_URI, callBackUrl);
		return builder.buildUrl();
	}
    
	/* (non-Javadoc)
	 * @see com.google.code.facebook.graph.client.oauth.FacebookOAuthService#getAuthorizationUrl(java.lang.String, java.util.Set)
	 */
	@Override
	public String getAuthorizationUrl(String callBackUrl,
			Set<Scope> permissions) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.OAuthUrls.AUTHORIZE_URL);
		builder.withParameter(ParameterNames.CLIENT_ID, clientId).withParameter(ParameterNames.REDIRECT_URI, callBackUrl);
		builder.withParameterEnumSet(ParameterNames.SCOPE, permissions, ",");
		return builder.buildUrl();
	}

    /* (non-Javadoc)
     * @see com.google.code.facebook.graph.client.oauth.FacebookOAuthService#getAccessToken(java.lang.String, java.lang.String)
     */
    @Override
	public String getAccessToken(String callBackUrl, String code) {
    	try {
    		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.OAuthUrls.ACCESS_TOKEN_URL);
    		builder.withParameter(ParameterNames.CLIENT_ID, clientId);
    		builder.withParameter(ParameterNames.CLIENT_SECRET, secret);
    		builder.withParameter(ParameterNames.REDIRECT_URI, callBackUrl);
    		builder.withParameter(ParameterNames.CODE, code);
    		
			String response = convertStreamToString(callApiGet(builder.buildUrl()));
			Matcher matcher = ApplicationConstants.ACCESS_TOKEN_PATTERN.matcher(response);
			if (matcher.find()) {
            	return matcher.group(1);
            } else {
            	throw new MendeleyException(response);
            }
		} catch (Exception e) {
			throw new MendeleyException(e);
		}
	}
}
