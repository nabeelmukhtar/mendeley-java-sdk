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

import com.mendeley.oapi.common.PagedList;
import com.mendeley.oapi.schema.Publication;
import com.mendeley.oapi.schema.Tag;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.PrivateStatsService;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class PrivateStatsServiceImpl.
 */
public class PrivateStatsServiceImpl extends BaseMendeleyPrivateService implements
		PrivateStatsService {

	/**
	 * Instantiates a new private stats service impl.
	 * 
	 * @param apiConsumer the api consumer
	 * @param accessToken the access token
	 */
	public PrivateStatsServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateStatsService#getAuthors()
	 */
	@Override
	public PagedList<User> getAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateStatsService#getPublications()
	 */
	@Override
	public PagedList<Publication> getPublications() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PrivateStatsService#getTags()
	 */
	@Override
	public PagedList<Tag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

}
