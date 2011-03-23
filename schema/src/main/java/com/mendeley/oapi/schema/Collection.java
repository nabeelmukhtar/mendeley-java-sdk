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
package com.mendeley.oapi.schema;

import com.mendeley.oapi.common.ValueEnum;

/**
 * The Class Collection.
 */
public class Collection extends SchemaEntity {

	/**
	 * The Enum MembershipType.
	 */
	public enum MembershipType implements ValueEnum {
		ADMINS("admins"), FOLLOWERS("followers"), MEMBERS("members"), OWNER("owner");
		
		private String value;
		
		MembershipType(String value) {
			this.value = value;
		}

		@Override
		public String value() {
			return value;
		}

	}
	
	/**
	 * The Enum Type.
	 */
	public enum Type implements ValueEnum {
		PRIVATE("private"), PUBLIC("public"), SHARED("shared");
		
		private String value;
		
		Type(String value) {
			this.value = value;
		}

		@Override
		public String value() {
			return value;
		}
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3484450630735705441L;
	
	private String id;
	private String name;
	private Type type;
	private int size;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
