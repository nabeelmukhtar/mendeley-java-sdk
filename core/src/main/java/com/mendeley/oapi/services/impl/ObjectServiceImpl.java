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
import com.mendeley.oapi.schema.Blob;
import com.mendeley.oapi.schema.Tree;
import com.mendeley.oapi.services.ObjectService;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;

/**
 * The Class ObjectServiceImpl.
 */
public class ObjectServiceImpl extends BaseMendeleyService implements
		ObjectService {

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getBlob(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Blob getBlob(String userName, String repositoryName, String treeSha,
			String filePath) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.ObjectApiUrls.GET_BLOBS_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.SHA, treeSha).withField(ParameterNames.FILE_PATH, filePath).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<Blob>(){}, json.get("blob"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getBlobs(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Blob> getBlobs(String userName, String repositoryName,
			String treeSha) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.ObjectApiUrls.GET_BLOBS_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.SHA, treeSha).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<Blob>>(){}, json.get("blobs"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getObjectContent(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public InputStream getObjectContent(String userName, String repositoryName,
			String objectSha) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.ObjectApiUrls.GET_OBJECT_CONTENT_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.SHA, objectSha).buildUrl();
        return callApiGet(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getTree(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Tree> getTree(String userName, String repositoryName,
			String treeSha) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.ObjectApiUrls.GET_TREE_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.SHA, treeSha).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<Tree>>(){}, json.get("tree"));
	}
}
