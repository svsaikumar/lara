package com.lara.pack6;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@PrimaryKeyJoinColumn(name="p_id")
public class Employee extends Person
{
	private String email;
	private Integer salary;
	
	
	
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public Integer getSalary()
	{
		return salary;
	}
	public void setSalary(Integer salary) 
	{
		this.salary = salary;
	}
	
}


