package com.lara.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person 
{
	
	
	
	@Id
	@Column(name="person_id")
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	private Address address;//no configuration is required for address(@Column)
	
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
}
//has a relation(also called as component mapping)
//person class having Address class
//for 'entity' classes only we can assign a table