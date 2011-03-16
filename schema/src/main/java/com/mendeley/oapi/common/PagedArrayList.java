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

import java.util.ArrayList;


/**
 * The Class PagedArrayList.
 */
public class PagedArrayList<E> extends ArrayList<E> implements PagedList<E> {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5011544152511118680L;
	
	/** The cursor. */
	private Cursor cursor = new Cursor();
	
	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#page()
	 */
	@Override
	public long page() {
		return cursor.getPage();
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#pages()
	 */
	@Override
	public long pages() {
		return cursor.getPages();
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#perPage()
	 */
	@Override
	public long perPage() {
		return cursor.getPerPage();
	}

	/* (non-Javadoc)
	 * @see org.worldbank.api.common.PagedList#total()
	 */
	@Override
	public long total() {
		return cursor.getTotal();
	}
	
	/**
	 * Gets the cursor.
	 * 
	 * @return the cursor
	 */
	public Cursor getCursor() {
		return cursor;
	}
	
	/**
	 * Sets the cursor.
	 * 
	 * @param cursor the new cursor
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}
	
	/**
	 * The Class Cursor.
	 */
	public static class Cursor {
		
		/** The page. */
		private long page;
		
		/** The pages. */
		private long pages;
		
		/** The per page. */
		private long perPage;
		
		/** The total. */
		private long total;
		
		/**
		 * Gets the page.
		 * 
		 * @return the page
		 */
		public long getPage() {
			return page;
		}
		
		/**
		 * Sets the page.
		 * 
		 * @param page the new page
		 */
		public void setPage(long page) {
			this.page = page;
		}
		
		/**
		 * Gets the pages.
		 * 
		 * @return the pages
		 */
		public long getPages() {
			return pages;
		}
		
		/**
		 * Sets the pages.
		 * 
		 * @param pages the new pages
		 */
		public void setPages(long pages) {
			this.pages = pages;
		}
		
		/**
		 * Gets the per page.
		 * 
		 * @return the per page
		 */
		public long getPerPage() {
			return perPage;
		}
		
		/**
		 * Sets the per page.
		 * 
		 * @param perPage the new per page
		 */
		public void setPerPage(long perPage) {
			this.perPage = perPage;
		}
		
		/**
		 * Gets the total.
		 * 
		 * @return the total
		 */
		public long getTotal() {
			return total;
		}
		
		/**
		 * Sets the total.
		 * 
		 * @param total the new total
		 */
		public void setTotal(long total) {
			this.total = total;
		}
	}
}
