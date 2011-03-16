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
import com.mendeley.oapi.schema.Document.Type;
import com.mendeley.oapi.services.SearchService;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

/**
 * The Class SearchServiceImpl.
 */
public class SearchServiceImpl extends BaseMendeleyPublicService implements
		SearchService {

	/**
	 * Instantiates a new search service impl.
	 * 
	 * @param apiConsumer the api consumer
	 */
	public SearchServiceImpl(MendeleyApiConsumer apiConsumer) {
		super(apiConsumer);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentDetails(java.lang.String)
	 */
	@Override
	public Document getDocumentDetails(String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentDetails(java.lang.String, com.mendeley.oapi.schema.Document.Type)
	 */
	@Override
	public Document getDocumentDetails(String documentId, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentsByAuthor(java.lang.String)
	 */
	@Override
	public PagedList<Document> getDocumentsByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentsByAuthor(java.lang.String, int)
	 */
	@Override
	public PagedList<Document> getDocumentsByAuthor(String authorName, int year) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentsByAuthor(java.lang.String, int, int)
	 */
	@Override
	public PagedList<Document> getDocumentsByAuthor(String authorName,
			int page, int itemsPerPage) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentsByTag(java.lang.String)
	 */
	@Override
	public PagedList<Document> getDocumentsByTag(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentsByTag(java.lang.String, int, int)
	 */
	@Override
	public PagedList<Document> getDocumentsByTag(String tag, int page,
			int itemsPerPage) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getDocumentsByTag(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public PagedList<Document> getDocumentsByTag(String tag, String category,
			String subCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#getRelatedDocuments(java.lang.String)
	 */
	@Override
	public PagedList<Document> getRelatedDocuments(String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#search(java.lang.String[])
	 */
	@Override
	public PagedList<Document> search(String... terms) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.SearchService#search(java.lang.String, int, int)
	 */
	@Override
	public PagedList<Document> search(String terms, int page, int itemsPerPage) {
		// TODO Auto-generated method stub
		return null;
	}

}
