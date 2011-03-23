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
 * The Class Group.
 */
public class Group extends SchemaEntity {

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
		PRIVATE("private"), PUBLIC("public");
		
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
	
	private Discipline disciplines;
	private String id;
	private String name;
	private String owner;
	private String publicUrl;
	private int totalDocuments;
	private Map<MembershipType, Integer> people = new HashMap<MembershipType, Integer>();
	private int size;
	private Type type;
	
	/**
	 * @return the disciplines
	 */
	public Discipline getDisciplines() {
		return disciplines;
	}
	/**
	 * @param disciplines the disciplines to set
	 */
	public void setDisciplines(Discipline disciplines) {
		this.disciplines = disciplines;
	}
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
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the publicUrl
	 */
	public String getPublicUrl() {
		return publicUrl;
	}
	/**
	 * @param publicUrl the publicUrl to set
	 */
	public void setPublicUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}
	/**
	 * @return the totalDocuments
	 */
	public int getTotalDocuments() {
		return totalDocuments;
	}
	/**
	 * @param totalDocuments the totalDocuments to set
	 */
	public void setTotalDocuments(int totalDocuments) {
		this.totalDocuments = totalDocuments;
	}
	/**
	 * @return the people
	 */
	public Map<MembershipType, Integer> getPeople() {
		return people;
	}
	/**
	 * @param people the people to set
	 */
	public void setPeople(Map<MembershipType, Integer> people) {
		this.people = people;
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
}
