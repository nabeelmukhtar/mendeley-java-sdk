
package com.mendeley.oapi.schema;


public class Status{
   	private String name;
   	private int value;

 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public int getValue(){
		return this.value;
	}
	public void setValue(int value){
		this.value = value;
	}
}
