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
package com.mendeley.oapi.common;

import java.util.List;

/**
 * The Interface PagedList.
 */
public interface PagedList<E> extends List<E> {

	/**
	 * Page.
	 * 
	 * @return the long
	 */
	public long page();
	
	/**
	 * Pages.
	 * 
	 * @return the long
	 */
	public long pages();
	
	/**
	 * Per page.
	 * 
	 * @return the long
	 */
	public long perPage();
	
	/**
	 * Total.
	 * 
	 * @return the long
	 */
	public long total();
}
