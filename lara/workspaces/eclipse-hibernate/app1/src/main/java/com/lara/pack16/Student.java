package com.lara.pack16;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="student")
public class Student
{
	
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="S_ID")
	@IndexColumn(name="student_id")
	private String[] mails;
	
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

}
