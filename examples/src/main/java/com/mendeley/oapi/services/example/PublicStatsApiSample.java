/*
 * Copyright 2011 Nabeel Mukhtar 
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
package com.mendeley.oapi.services.example;

import java.util.List;

import com.mendeley.oapi.schema.Publication;
import com.mendeley.oapi.services.MendeleyServiceFactory;
import com.mendeley.oapi.services.PublicStatsService;

/**
 * The Class PublicStatsApiSample.
 */
public class PublicStatsApiSample {

	/** The Constant CONSUMER_KEY. */
	private static final String CONSUMER_KEY = "fb5f4f918e29a86d60ccede660d3d68b04d37e9f6";
	
	/** The Constant CONSUMER_SECRET. */
	private static final String CONSUMER_SECRET = "ecde8b6a67627dc6f3dd53ba59ba4553";
	
    /**
     * The main method.
     * 
     * @param args the arguments
     * 
     * @throws Exception the exception
     */
	public static void main(String[] args) throws Exception {
		MendeleyServiceFactory factory = MendeleyServiceFactory.newInstance(CONSUMER_KEY, CONSUMER_SECRET);
		PublicStatsService service = factory.createPublicStatsService();
		List<Publication> publications = service.getPublications();
		for (Publication publication : publications) {
			printResult(publication);
		}
	}
    
	/**
	 * Prints the result.
	 * 
	 * @param publication the publication
	 */
	private static void printResult(Publication publication) {
		System.out.println(publication);
	}
}
