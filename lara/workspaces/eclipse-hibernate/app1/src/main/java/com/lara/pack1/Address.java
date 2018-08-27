package com.lara.pack1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
@Table
public class Address 
{
	
	@Column(name = "house-no")
	private String houseNo;
	
	
	@Column(name = "street-name")
	private String streetName;
	
	
	
	public String getHouseNo()
	{
		return houseNo;
	}
	public void setHouseNo(String houseNo) 
	{
		this.houseNo = houseNo;
	}
	public String getStreetName() 
	{
		return streetName;
	}
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
}
//if didn't' mention column annotation, column name will be attribute name only