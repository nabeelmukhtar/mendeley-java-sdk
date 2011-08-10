/*
 * Copyright 2011 Nabeel Mukhtar 
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


/**
 * The Class Status.
 */
public class Status{
   	
	   /** The name. */
	   private String name;
   	
	   /** The value. */
	   private int value;

 	/**
	  * Gets the name.
	  * 
	  * @return the name
	  */
	 public String getName(){
		return this.name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name the new name
	 */
	public void setName(String name){
		this.name = name;
	}
 	
	 /**
	  * Gets the value.
	  * 
	  * @return the value
	  */
	 public int getValue(){
		return this.value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the new value
	 */
	public void setValue(int value){
		this.value = value;
	}
}
