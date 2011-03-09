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

import java.io.InputStream;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.schema.Gist;
import com.mendeley.oapi.services.GistService;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;

/**
 * The Class GistServiceImpl.
 */
public class GistServiceImpl extends BaseMendeleyService implements
		GistService {

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.GistService#getGist(java.lang.String)
	 */
	@Override
	public Gist getGist(String gistId) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.GistApiUrls.GET_GIST_URL);
        String                apiUrl  = builder.withField(ParameterNames.GIST_ID, gistId).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        List<Gist> gists = unmarshall(new TypeToken<List<Gist>>(){}, json.get("gists"));
        return (gists.isEmpty())? null : gists.get(0);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.GistService#getGistContent(java.lang.String, java.lang.String)
	 */
	@Override
	public InputStream getGistContent(String gistId, String fileName) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.GistApiUrls.GET_GIST_CONTENT_URL);
        String                apiUrl  = builder.withField(ParameterNames.GIST_ID, gistId).withField(ParameterNames.FILE_NAME, fileName).buildUrl();
        return callApiGet(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.GistService#getUserGists(java.lang.String)
	 */
	@Override
	public List<Gist> getUserGists(String userName) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.GistApiUrls.GET_USER_GISTS_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<Gist>>(){}, json.get("gists"));
	}
}
