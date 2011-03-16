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
import com.mendeley.oapi.services.DocumentService;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class DocumentServiceImpl.
 */
public class DocumentServiceImpl extends BaseMendeleyPrivateService implements
		DocumentService {

	/**
	 * Instantiates a new document service impl.
	 * 
	 * @param apiConsumer the api consumer
	 * @param accessToken the access token
	 */
	public DocumentServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.DocumentService#createDocument(com.mendeley.oapi.schema.Document)
	 */
	@Override
	public void createDocument(Document document) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.DocumentService#getAuthoredPublications()
	 */
	@Override
	public PagedList<Document> getAuthoredPublications() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.DocumentService#getDocumentDetails(java.lang.String)
	 */
	@Override
	public Document getDocumentDetails(String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.DocumentService#getDocumentIds()
	 */
	@Override
	public PagedList<String> getDocumentIds() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.DocumentService#getDocumentIds(int, int)
	 */
	@Override
	public PagedList<String> getDocumentIds(int page, int itemsPerPage) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.DocumentService#removeDocument(java.lang.String)
	 */
	@Override
	public void removeDocument(String documentId) {
		// TODO Auto-generated method stub
		
	}
}
