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

import com.mendeley.oapi.services.impl.CollectionServiceImpl;
import com.mendeley.oapi.services.impl.DocumentServiceImpl;
import com.mendeley.oapi.services.impl.PrivateGroupServiceImpl;
import com.mendeley.oapi.services.impl.PrivateStatsServiceImpl;
import com.mendeley.oapi.services.impl.ProfileServiceImpl;
import com.mendeley.oapi.services.impl.PublicGroupServiceImpl;
import com.mendeley.oapi.services.impl.PublicStatsServiceImpl;
import com.mendeley.oapi.services.impl.SearchServiceImpl;
import com.mendeley.oapi.services.impl.SharedCollectionServiceImpl;




/**
 * A factory for creating MendeleyService objects.
 */
public class MendeleyServiceFactory {

    /**
     * Instantiates a new mendeley service factory.
     */
	private MendeleyServiceFactory() {
    }
	
    /**
     * New instance.
     * 
     * @return the mendeley service factory
     */
    public static MendeleyServiceFactory newInstance() {
        return new MendeleyServiceFactory();
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the private stats service
     */
    public PrivateStatsService createPrivateStatsService() {
    	return new PrivateStatsServiceImpl();
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the private group service
     */
    public PrivateGroupService createPrivateGroupService() {
    	return new PrivateGroupServiceImpl();
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the collection service
     */
    public CollectionService createCollectionService() {
    	return new CollectionServiceImpl();
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the shared collection service
     */
    public SharedCollectionService createSharedCollectionService() {
    	return new SharedCollectionServiceImpl();
    }

    /**
     * Creates a new MendeleyService object.
     * 
     * @return the public group service
     */
    public PublicGroupService createPublicGroupService() {
    	return new PublicGroupServiceImpl();
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the profile service
     */
    public ProfileService createProfileService() {
    	return new ProfileServiceImpl();
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @param clientId the client id
     * @param secret the secret
     * 
     * @return the public stats service
     */
    public PublicStatsService createPublicStatsService(String clientId, String secret) {
    	return new PublicStatsServiceImpl(clientId, secret);    	
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the document service
     */
    public DocumentService createDocumentService() {
    	return new DocumentServiceImpl();    	
    }
    
    /**
     * Creates a new MendeleyService object.
     * 
     * @return the search service
     */
    public SearchService createSearchService() {
    	return new SearchServiceImpl();    	
    }
}
