package com.lara.pack18;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;


@Entity
@Table(name="STUDENT")
public class Student 
{
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="B_S",//intermediate joining table//
				joinColumns= {@JoinColumn(name="S_ID")},//foreig key  in student
				inverseJoinColumns= {@JoinColumn(name="B_ID")})//foreign key in batch
	private Set<Batch> batches = new HashSet<Batch>();
	
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
	public Set<Batch> getBatches() {
		return batches;
	}
	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}	
}
