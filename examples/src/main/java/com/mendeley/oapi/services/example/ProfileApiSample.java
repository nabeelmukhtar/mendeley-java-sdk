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

import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.MendeleyServiceFactory;
import com.mendeley.oapi.services.ProfileService;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;

/**
 * The Class ProfileApiSample.
 */
public class ProfileApiSample {
    
	/** The Constant CONSUMER_KEY. */
	private static final String CONSUMER_KEY = "fb5f4f918e29a86d60ccede660d3d68b04d37e9f6";
	
	/** The Constant CONSUMER_SECRET. */
	private static final String CONSUMER_SECRET = "ecde8b6a67627dc6f3dd53ba59ba4553";
	
	/** The Constant ACCESS_TOKEN. */
	private static final String ACCESS_TOKEN = "564d0e4e13273906aa55d53b903d48e204d7e0501";
	
	/** The Constant TOKEN_SECRET. */
	private static final String TOKEN_SECRET = "1c8e2290a0a894bc1d1cbf4b0cc07484";
	
    /**
     * The main method.
     * 
     * @param args the arguments
     */
	public static void main(String[] args) {
		MendeleyServiceFactory factory = MendeleyServiceFactory.newInstance(CONSUMER_KEY, CONSUMER_SECRET);
		ProfileService service = factory.createProfileService(new MendeleyAccessToken(ACCESS_TOKEN, TOKEN_SECRET));
		List<User> users = service.getContacts();
		for (User user : users) {
			printResult(user);			
		}
	}
    
	/**
	 * Prints the result.
	 * 
	 * @param user the user
	 */
	private static void printResult(User user) {
		System.out.println(user);
	}
}
