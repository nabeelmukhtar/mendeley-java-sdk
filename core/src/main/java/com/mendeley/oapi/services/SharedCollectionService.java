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
package com.mendeley.oapi.services;

import java.util.List;
import java.util.Map;

import com.mendeley.oapi.common.PagedList;
import com.mendeley.oapi.schema.Collection;
import com.mendeley.oapi.schema.User;

/**
 * The Interface SharedCollectionService.
 */
public interface SharedCollectionService extends MendeleyService {
	
	/**
	 * Gets the collections.
	 * 
	 * @return the collections
	 */
	public PagedList<Collection> getCollections();
	
	/**
	 * Gets the collection documents.
	 * 
	 * @param collectionId the collection id
	 * 
	 * @return the collection documents
	 */
	public PagedList<String> getCollectionDocuments(String collectionId);
	
	/**
	 * Gets the collection documents.
	 * 
	 * @param collectionId the collection id
	 * @param page the page
	 * @param itemsPerPage the items per page
	 * 
	 * @return the collection documents
	 */
	public PagedList<String> getCollectionDocuments(String collectionId, int page, int itemsPerPage);
	
	/**
	 * Gets the collection members.
	 * 
	 * @param collectionId the collection id
	 * 
	 * @return the collection members
	 */
	public Map<Collection.MembershipType, List<User>> getCollectionMembers(String collectionId);
	
	/**
	 * Adds the document to collection.
	 * 
	 * @param collectionId the collection id
	 * @param documentId the document id
	 * 
	 * @return the string
	 */
	public String addDocumentToCollection(String collectionId, String documentId);
	
	/**
	 * Creates the collection.
	 * 
	 * @param name the name
	 * 
	 * @return the collection
	 */
	public Collection createCollection(String name);
	
	/**
	 * Removes the collection.
	 * 
	 * @param collectionId the collection id
	 */
	public void removeCollection(String collectionId);
	
	/**
	 * Removes the document from collection.
	 * 
	 * @param collectionId the collection id
	 * @param documentId the document id
	 */
	public void removeDocumentFromCollection(String collectionId, String documentId);
}
