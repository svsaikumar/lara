package com.lara.pack7;

import org.hibernate.Session;

import com.lara.Util;

public class Manager2
{
	
	public static void main(String[] args) 
	{
		Session session = Util.getSession();
		Address add = (Address) session.load(Address.class, 1);
		System.out.println(add.getAddressId());
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		System.out.println(add.getStudent().getFirstName());
		System.out.println(add.getStudent().getLastName());
		System.out.println("done");
	}
}
