package com.lara.pack3;

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
//from Person class, only public getters and setters are inherited methods(In Person class all are public)
