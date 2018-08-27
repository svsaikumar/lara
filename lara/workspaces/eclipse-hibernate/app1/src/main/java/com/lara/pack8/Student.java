package com.lara.pack8;

public class Student 
{
	private int id;
	private String firstName;
	private String lastName;
	private Address permanentAddress;
	
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
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
	public Address getPermanentAddress() 
	{
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress)
	{
		this.permanentAddress = permanentAddress;
	}
	
}
