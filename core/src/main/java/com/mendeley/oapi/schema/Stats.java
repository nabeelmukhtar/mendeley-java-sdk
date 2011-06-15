
package com.mendeley.oapi.schema;

import java.util.List;

public class Stats{
   	private List<Country> country;
   	private List<Discipline> discipline;
   	private int readers;
   	private List<Status> status;

 	public List<Country> getCountry(){
		return this.country;
	}
	public void setCountry(List<Country> country){
		this.country = country;
	}
 	public List<Discipline> getDiscipline(){
		return this.discipline;
	}
	public void setDiscipline(List<Discipline> discipline){
		this.discipline = discipline;
	}
 	public int getReaders(){
		return this.readers;
	}
	public void setReaders(int readers){
		this.readers = readers;
	}
 	public List<Status> getStatus(){
		return this.status;
	}
	public void setStatus(List<Status> status){
		this.status = status;
	}
}
