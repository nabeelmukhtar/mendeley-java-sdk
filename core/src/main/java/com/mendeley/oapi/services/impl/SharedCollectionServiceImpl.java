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
import com.mendeley.oapi.schema.Collection;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.schema.Collection.MembershipType;
import com.mendeley.oapi.services.SharedCollectionService;
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
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#createCollection(java.lang.String)
	 */
	@Override
	public Collection createCollection(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#getCollectionDocuments(java.lang.String)
	 */
	@Override
	public PagedList<String> getCollectionDocuments(String collectionId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#getCollectionDocuments(java.lang.String, int, int)
	 */
	@Override
	public PagedList<String> getCollectionDocuments(String collectionId,
			int page, int itemsPerPage) {
		// TODO Auto-generated method stub
		return null;
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
	public PagedList<Collection> getCollections() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#removeCollection(java.lang.String)
	 */
	@Override
	public void removeCollection(String collectionId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SharedCollectionService#removeDocumentFromCollection(java.lang.String, java.lang.String)
	 */
	@Override
	public void removeDocumentFromCollection(String collectionId,
			String documentId) {
		// TODO Auto-generated method stub
		
	}

}
