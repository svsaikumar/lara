package com.lara.pack17;

import java.util.HashSet;
import java.util.Set;

public class Student 
{
	private int id;
	private String firstName;
	private String lastName;
	private Set batches = new HashSet();//one student attending multiple batches
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set getBatches() {
		return batches;
	}
	public void setBatches(Set batches) {
		this.batches = batches;
	}
	
}
