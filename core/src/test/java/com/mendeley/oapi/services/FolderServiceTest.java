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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class CollectionServiceTest.
 */
public class FolderServiceTest extends BaseMendeleyServiceTest {
	
	/** The service. */
	private FolderService service;

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.BaseGitHubServiceTest#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		service = factory.createFolderService(authentication);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.BaseGitHubServiceTest#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		super.tearDown();
		service = null;
	}

	/**
	 * Test add document to collection.
	 */
	@Test
	public void testAddDocumentToFolder() {
		fail("Not yet implemented");
	}

	/**
	 * Test create collection.
	 */
	@Test
	public void testCreateFolder() {
		fail("Not yet implemented");
	}

	/**
	 * Test get collection documents string.
	 */
	@Test
	public void testGetFolderDocumentsString() {
		fail("Not yet implemented");
	}

	/**
	 * Test get collection documents string int int.
	 */
	@Test
	public void testGetFolderDocumentsStringIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test get collections.
	 */
	@Test
	public void testGetFolders() {
		fail("Not yet implemented");
	}

	/**
	 * Test remove collection.
	 */
	@Test
	public void testRemoveFolder() {
		fail("Not yet implemented");
	}

	/**
	 * Test remove document from collection.
	 */
	@Test
	public void testRemoveDocumentFromFolder() {
		fail("Not yet implemented");
	}
}