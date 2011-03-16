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

import java.util.List;
import java.util.Map;

import com.mendeley.oapi.common.PagedList;
import com.mendeley.oapi.schema.Group;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.schema.Group.MembershipType;
import com.mendeley.oapi.schema.Group.Type;
import com.mendeley.oapi.services.PrivateGroupService;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class PrivateGroupServiceImpl.
 */
public class PrivateGroupServiceImpl extends BaseMendeleyPrivateService implements
		PrivateGroupService {

	/**
	 * Instantiates a new private group service impl.
	 * 
	 * @param apiConsumer the api consumer
	 * @param accessToken the access token
	 */
	public PrivateGroupServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#createGroup(java.lang.String, com.mendeley.oapi.schema.Group.Type)
	 */
	@Override
	public Group createGroup(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#deleteGroup(java.lang.String)
	 */
	@Override
	public void deleteGroup(String groupId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#getGroupDetails(java.lang.String)
	 */
	@Override
	public Group getGroupDetails(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#getGroupPeople(java.lang.String)
	 */
	@Override
	public Map<MembershipType, List<User>> getGroupPeople(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#getGroups()
	 */
	@Override
	public PagedList<Group> getGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#leaveGroup(java.lang.String)
	 */
	@Override
	public void leaveGroup(String groupId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateGroupService#unfollowGroup(java.lang.String)
	 */
	@Override
	public void unfollowGroup(String groupId) {
		// TODO Auto-generated method stub
		
	}

}
