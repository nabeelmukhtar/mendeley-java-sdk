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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.schema.PullRequest;
import com.mendeley.oapi.schema.Issue.State;
import com.mendeley.oapi.services.PullRequestService;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;

/**
 * The Class PullRequestServiceImpl.
 */
public class PullRequestServiceImpl extends BaseMendeleyService implements
		PullRequestService {

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getBlob(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public PullRequest getPullRequest(String userName, String repositoryName, int issueNumber) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.PullRequestApiUrls.GET_PULL_REQUEST_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.ISSUE_NUMBER, String.valueOf(issueNumber)).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<PullRequest>(){}, json.get("pull"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getBlobs(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<PullRequest> getPullRequests(String userName, String repositoryName) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.PullRequestApiUrls.GET_PULL_REQUESTS_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.STATE, "").buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<PullRequest>>(){}, json.get("pulls"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getBlobs(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<PullRequest> getPullRequests(String userName, String repositoryName, State state) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.PullRequestApiUrls.GET_PULL_REQUESTS_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.STATE, state.value()).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<PullRequest>>(){}, json.get("pulls"));
	}
	
	/* (non-Javadoc)
	 * @see com.github.api.v2.services.ObjectService#getObjectContent(java.lang.String, java.lang.String, java.lang.String)
	 */
	public PullRequest createPullRequest(String userName, String repositoryName, String base, String head, String title, String body) {
		MendeleyApiUrlBuilder builder = createGitHubApiUrlBuilder(MendeleyApiUrls.PullRequestApiUrls.CREATE_PULL_REQUEST_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("pull[" + ParameterNames.BASE + "]", base);
        parameters.put("pull[" + ParameterNames.HEAD + "]", head);
        parameters.put("pull[" + ParameterNames.TITLE + "]", title);
        parameters.put("pull[" + ParameterNames.BODY + "]", body);
        JsonObject json = unmarshall(callApiPost(apiUrl, parameters));
        
        return unmarshall(new TypeToken<PullRequest>(){}, json.get("pull"));
	}
}
