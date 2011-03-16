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
import com.mendeley.oapi.schema.Document;
import com.mendeley.oapi.schema.Publication;
import com.mendeley.oapi.schema.Tag;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.PublicStatsService;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class PublicStatsServiceImpl.
 */
public class PublicStatsServiceImpl extends BaseMendeleyPublicService implements PublicStatsService {

	/**
	 * Instantiates a new public stats service impl.
	 * 
	 * @param apiConsumer the api consumer
	 */
	public PublicStatsServiceImpl(MendeleyApiConsumer apiConsumer) {
		super(apiConsumer);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getAuthors()
	 */
	@Override
	public PagedList<User> getAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getAuthors(java.lang.String)
	 */
	@Override
	public PagedList<User> getAuthors(String disciplineId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getAuthors(java.lang.String, boolean)
	 */
	@Override
	public PagedList<User> getAuthors(String disciplineId, boolean upandcoming) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getPapers()
	 */
	@Override
	public PagedList<Document> getPapers() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getPapers(java.lang.String)
	 */
	@Override
	public PagedList<Document> getPapers(String disciplineId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getPapers(java.lang.String, boolean)
	 */
	@Override
	public PagedList<Document> getPapers(String disciplineId,
			boolean upandcoming) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getPublications()
	 */
	@Override
	public PagedList<Publication> getPublications() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getPublications(java.lang.String)
	 */
	@Override
	public PagedList<Publication> getPublications(String disciplineId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getPublications(java.lang.String, boolean)
	 */
	@Override
	public PagedList<Publication> getPublications(String disciplineId,
			boolean upandcoming) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.PublicStatsService#getTags(java.lang.String)
	 */
	@Override
	public PagedList<Tag> getTags(String disciplineId) {
		// TODO Auto-generated method stub
		return null;
	}
}
