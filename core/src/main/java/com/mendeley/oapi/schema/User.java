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

import java.util.HashMap;
import java.util.Map;

import com.mendeley.oapi.common.ValueEnum;

/**
 * The Class User.
 */
public class User extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3484450630735705441L;
	
	/**
	 * The Enum Type.
	 */
	public enum Section implements ValueEnum {
		MAIN("main"), AWARDS("awards"), CV("cv"), CONTACT("contact"), CONSULTING("consulting"), EDUCATION("education"), EMPLOYMENT("employment");
		
		
	    /** The Constant stringToEnum. */
		private static final Map<String, Section> stringToEnum = new HashMap<String, Section>();

		static { // Initialize map from constant name to enum constant
			for (Section op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
		/** The value. */
		private String value;

		/**
		 * Instantiates a new type.
		 * 
		 * @param value the value
		 */
		Section(String value) {
			this.value = value;
		}

		/* (non-Javadoc)
		 * @see com.mendeley.oapi.common.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}

		/**
		 * From value.
		 * 
		 * @param value the value
		 * 
		 * @return the image color
		 */
		public static Section fromValue(String value) {
			return stringToEnum.get(value);
		}
	}
	
	/** The name. */
	private String name;
	
	/** The value. */
	private String value;
	
	/** The user id. */
	private String userId;
	
	/**
	 * The profile id.
	 */
	private String profileId;
	
	/**
	 * Gets the user id.
	 * 
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 * 
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + ", value=" + value
				+ "]";
	}
}
