package com.lara.pack5;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;







@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="person")
@DiscriminatorColumn(name="obj_type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("person")
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
//
