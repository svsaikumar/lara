package com.lara.pack1;

import org.hibernate.Session;

import com.lara.Util;

public class M2 
{
	public static void main(String[] args) 
	{
		
		
		
		
		Address add = new Address();
		add.setHouseNo("123/C");
		add.setStreetName("BTM");
		
		
		Person p1 = new Person();
		p1.setId(102);
		p1.setFirstName("vijay");
		p1.setLastName("xyz");
		p1.setAddress(add);
		
		
		
		Session session = Util.getSession();
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
		
		System.out.println("done");

	}
}
