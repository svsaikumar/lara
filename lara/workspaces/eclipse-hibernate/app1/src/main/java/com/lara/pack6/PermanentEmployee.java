package com.lara.pack6;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="P_emp")
@PrimaryKeyJoinColumn(name="e_id")
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