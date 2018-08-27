package com.lara.pack5;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("emp")
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

//no need to specify "InheritanceType" for employee class
