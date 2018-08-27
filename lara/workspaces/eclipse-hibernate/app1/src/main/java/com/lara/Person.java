package com.lara;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;




//@Entity
//@Table(name="PERSON")//here we are assigning table 'PERSON' to 'Person' pojo class
//
//
//@NamedNativeQueries({
//@NamedNativeQuery(name="sql1", query="select first_name, last_name from person"),
//@NamedNativeQuery(name="sql2", query="select first_name, last_name from person")
//
//})
public class Person 
{
	@Id//inorder to specify primary key column , we have to use @Id
	@Column(name="PERSON_ID")
	private Integer Id;
	
	@Column(name="first_name")//if column name is other than attribute name, then specify column name
	private String firstName;
	
	
	@Column(name="last_name")//if column name is other than attribute name, then specify column name
	private String lastName;
	
	
	private Integer age;


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
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


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
//inside the POJO class, we can do configuration(which is know as programmatic configuration) using annotations
//@Id is used for primary key column

//when person class is loaded, annotations are also loaded
//Class object contains every information about class
//whenever configuration is modifying , no need to modify java class
