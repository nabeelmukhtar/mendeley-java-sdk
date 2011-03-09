/*
 * Copyright 2010 Nabeel Mukhtar 
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

import com.mendeley.oapi.schema.Feed;
import com.mendeley.oapi.schema.FeedEntry;
import com.mendeley.oapi.services.FeedService;
import com.mendeley.oapi.services.MendeleyServiceFactory;

/**
 * The Class FeedSample.
 */
public class FeedSample {

    /**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		MendeleyServiceFactory factory = MendeleyServiceFactory.newInstance();
		FeedService service = factory.createFeedService();
		Feed feed = service.getPublicUserFeed("apache", 10);
		printResult(feed);
	}

	/**
	 * Prints the result.
	 * 
	 * @param feed
	 *            the feed
	 */
	private static void printResult(Feed feed) {
		if (feed != null) {
			System.out.println(feed.getAuthor());
			System.out.println(feed.getLink());
			System.out.println(feed.getDescription());
			for (FeedEntry entry : feed.getEntries()) {
				System.out.println(entry);
			}
		}
	}
}
