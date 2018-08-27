package com.lara.pack3;

public class PermanentEmployee extends Employee
{
	private String designation;
	private Integer leaves;
	
	
	
	
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public Integer getLeaves() 
	{
		return leaves;
	}
	public void setLeaves(Integer leaves) 
	{
		this.leaves = leaves;
	}
}
//in this class also, several public setters and getters are available
//three class under one inheritance