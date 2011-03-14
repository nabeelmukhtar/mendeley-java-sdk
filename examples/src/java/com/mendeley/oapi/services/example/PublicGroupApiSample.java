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
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.mendeley.oapi.schema.Language;
import com.mendeley.oapi.schema.Repository;
import com.mendeley.oapi.services.MendeleyServiceFactory;
import com.mendeley.oapi.services.PublicGroupService;

/**
 * The Class PublicGroupApiSample.
 */
public class PublicGroupApiSample {

    /**
     * The main method.
     * 
     * @param args the arguments
     * 
     * @throws Exception the exception
     */
	public static void main(String[] args) throws Exception {
		MendeleyServiceFactory factory = MendeleyServiceFactory.newInstance();
		PublicGroupService service = factory.createPublicGroupService();
		List<Repository> repositories = service.searchRepositories("hadoop");
		for (Repository repository : repositories) {
			printResult(repository);
		}
		Map<Language, Long> breakDown = service.getLanguageBreakdown("facebook", "tornado");
		System.out.println(breakDown);
		ZipInputStream zip = service.getRepositoryArchive("nabeelmukhtar", "github-java-sdk", Repository.MASTER);
		ZipEntry entry = null;
		while ((entry = zip.getNextEntry()) != null) {
			System.out.println(entry.getName());
		}
	}
    
	/**
	 * Prints the result.
	 * 
	 * @param repository the repository
	 */
	private static void printResult(Repository repository) {
		System.out.println(repository);
	}
}
