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

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.schema.Key;
import com.mendeley.oapi.schema.Organization;
import com.mendeley.oapi.schema.Repository;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.ProfileService;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;

/**
 * The Class ProfileServiceImpl.
 */
public class ProfileServiceImpl extends BaseMendeleyService implements
		ProfileService {

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#addEmail(java.lang.String)
	 */
	@Override
	public void addEmail(String email) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.ADD_EMAIL_URL);
        String                apiUrl  = builder.buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(ParameterNames.EMAIL, email);
		callApiPost(apiUrl, parameters);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#addKey(java.lang.String, java.lang.String)
	 */
	@Override
	public void addKey(String title, String key) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.ADD_KEY_URL);
        String                apiUrl  = builder.buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(ParameterNames.TITLE, title);
        parameters.put(ParameterNames.KEY, key);
		callApiPost(apiUrl, parameters);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#followUser(java.lang.String)
	 */
	@Override
	public void followUser(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.FOLLOW_USER_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
		callApiPost(apiUrl, new HashMap<String, String>());
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getCurrentUser()
	 */
	@Override
	public User getCurrentUser() {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_CURRENT_USER_URL);
        String                apiUrl  = builder.buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<User>(){}, json.get("user"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getEmails()
	 */
	@Override
	public List<String> getEmails() {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_EMAILS_URL);
        String                apiUrl  = builder.buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<String>>(){}, json.get("emails"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getKeys()
	 */
	@Override
	public List<Key> getKeys() {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_KEYS_URL);
        String                apiUrl  = builder.buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<Key>>(){}, json.get("public_keys"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getUserByUsername(java.lang.String)
	 */
	@Override
	public User getUserByUsername(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_USER_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<User>(){}, json.get("user"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getUserFollowers(java.lang.String)
	 */
	@Override
	public List<String> getUserFollowers(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_USER_FOLLOWERS_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<String>>(){}, json.get("users"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getUserFollowing(java.lang.String)
	 */
	@Override
	public List<String> getUserFollowing(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_USER_FOLLOWING_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<String>>(){}, json.get("users"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getWatchedRepositories(java.lang.String)
	 */
	@Override
	public List<Repository> getWatchedRepositories(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_WATCHED_REPOSITORIES_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<Repository>>(){}, json.get("repositories"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#removeEmail(java.lang.String)
	 */
	@Override
	public void removeEmail(String email) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.REMOVE_EMAIL_URL);
        String                apiUrl  = builder.buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(ParameterNames.EMAIL, email);
		callApiPost(apiUrl, parameters);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#removeKey(java.lang.String)
	 */
	@Override
	public void removeKey(String id) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.REMOVE_KEY_URL);
        String                apiUrl  = builder.buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(ParameterNames.ID, id);
		callApiPost(apiUrl, parameters);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getUserByEmail(java.lang.String)
	 */
	@Override
	public User getUserByEmail(String email) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.SEARCH_USERS_BY_EMAIL_URL);
        String                apiUrl  = builder.withField(ParameterNames.EMAIL, email).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<User>(){}, json.get("user"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#searchUsersByName(java.lang.String)
	 */
	@Override
	public List<User> searchUsersByName(String name) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.SEARCH_USERS_BY_NAME_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, name).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
		Gson gson = getGsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
		return gson.fromJson(json.get("users"), new TypeToken<List<User>>(){}.getType());
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#unfollowUser(java.lang.String)
	 */
	@Override
	public void unfollowUser(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.UNFOLLOW_USER_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
		callApiPost(apiUrl, new HashMap<String, String>());
	}
	
	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#getUserOrganizations(java.lang.String)
	 */
	@Override
	public List<Organization> getUserOrganizations(String userName) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_USER_ORGANIZATIONS);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(new TypeToken<List<Organization>>(){}, json.get("organizations"));
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.UserService#updateUser(com.github.api.v2.schema.User)
	 */
	@Override
	public void updateUser(User user) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.UPDATE_USER_URL);
		String userName = (user.getUsername() == null) ? user.getLogin() : user.getUsername();
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("values[" + ParameterNames.NAME + "]", user.getName());
        parameters.put("values[" + ParameterNames.EMAIL + "]", user.getEmail());
        parameters.put("values[" + ParameterNames.BLOG + "]", user.getBlog());
        parameters.put("values[" + ParameterNames.COMPANY + "]", user.getCompany());
        parameters.put("values[" + ParameterNames.LOCATION + "]", user.getLocation());
		callApiPost(apiUrl, parameters);
	}

}
