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

import java.util.ArrayList;
import java.util.List;

import com.mendeley.oapi.common.ValueEnum;

/**
 * The Class Document.
 */
public class Document extends SchemaEntity {

	/**
	 * The Enum Type.
	 */
	public enum Type implements ValueEnum {
		;
		
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
	private String title;
	private String documentAbstract;
	private String publicationOutlet;
	private int year;
	private String mendeleyUrl;
	private String doi;
	private List<String> authors = new ArrayList<String>();
	private List<String> editors = new ArrayList<String>();
	private List<String> keywords = new ArrayList<String>();
	private List<String> tags = new ArrayList<String>();
	private String issue;
	private String volume;
	private String pages;
	private Type type;
	private String url;
	private String uuid;
	private String city;
	private String publisher;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
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
	 * @return the publicationOutlet
	 */
	public String getPublicationOutlet() {
		return publicationOutlet;
	}
	/**
	 * @param publicationOutlet the publicationOutlet to set
	 */
	public void setPublicationOutlet(String publicationOutlet) {
		this.publicationOutlet = publicationOutlet;
	}
	/**
	 * @return the mendeleyUrl
	 */
	public String getMendeleyUrl() {
		return mendeleyUrl;
	}
	/**
	 * @param mendeleyUrl the mendeleyUrl to set
	 */
	public void setMendeleyUrl(String mendeleyUrl) {
		this.mendeleyUrl = mendeleyUrl;
	}
	/**
	 * @return the doi
	 */
	public String getDoi() {
		return doi;
	}
	/**
	 * @param doi the doi to set
	 */
	public void setDoi(String doi) {
		this.doi = doi;
	}
	/**
	 * @return the authors
	 */
	public List<String> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	/**
	 * @return the documentAbstract
	 */
	public String getAbstract() {
		return documentAbstract;
	}
	/**
	 * @param documentAbstract the documentAbstract to set
	 */
	public void setAbstract(String documentAbstract) {
		this.documentAbstract = documentAbstract;
	}
	/**
	 * @return the editors
	 */
	public List<String> getEditors() {
		return editors;
	}
	/**
	 * @param editors the editors to set
	 */
	public void setEditors(List<String> editors) {
		this.editors = editors;
	}
	/**
	 * @return the keywords
	 */
	public List<String> getKeywords() {
		return keywords;
	}
	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	/**
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}
	/**
	 * @param issue the issue to set
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}
	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}
	/**
	 * @return the pages
	 */
	public String getPages() {
		return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(String pages) {
		this.pages = pages;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
