package com.lara.pack1;

import org.hibernate.Session;

import com.lara.Util;

public class M3
{
	
	
	public static void main(String[] args) 
	{
			
		Session session = Util.getSession();
		Person p1 = (Person)session.load(Person.class,102);//first arg POJO class, 2nd arg is primary key column record
		System.out.print(p1.getId() + "\t");
		System.out.print(p1.getFirstName()+ "\t");
		System.out.print(p1.getLastName()+ "\t");
		System.out.print(p1.getAddress().getHouseNo()+ "\t");
		System.out.println(p1.getAddress().getStreetName());
		
		System.out.println("done");

	}
}
//reading a record
//while reading transaction is not required
