
package com.mendeley.oapi.schema;


public class Country{
   	private String name;
   	private Number value;

 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public Number getValue(){
		return this.value;
	}
	public void setValue(Number value){
		this.value = value;
	}
}
