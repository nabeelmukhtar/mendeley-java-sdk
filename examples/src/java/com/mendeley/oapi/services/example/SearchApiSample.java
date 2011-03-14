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
package com.mendeley.oapi.services.example;

import java.util.List;

import com.mendeley.oapi.schema.PullRequest;
import com.mendeley.oapi.services.MendeleyServiceFactory;
import com.mendeley.oapi.services.SearchService;

/**
 * The Class SearchApiSample.
 */
public class SearchApiSample {

    /**
     * The main method.
     * 
     * @param args the arguments
     */
	public static void main(String[] args) {
		MendeleyServiceFactory factory = MendeleyServiceFactory.newInstance();
		SearchService service = factory.createSearchService();
		List<PullRequest> pullRequests = service.getPullRequests("technoweenie", "faraday");
		for (PullRequest pullRequest : pullRequests) {
			printResult(pullRequest);    			
		}
		PullRequest pullRequest = service.getPullRequest("technoweenie", "faraday", 15);
		printResult(pullRequest);
	}
    
	/**
	 * Prints the result.
	 * 
	 * @param pullRequest the pull request
	 */
	private static void printResult(PullRequest pullRequest) {
		System.out.println(pullRequest);
	}
}
