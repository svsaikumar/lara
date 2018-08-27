package com.lara.pack4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;








@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="person")
public class Person 
{
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	
	
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

}
//first type of inheritance mapping
//using annotatins
