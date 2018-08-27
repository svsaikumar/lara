package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M22 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		
		Query query = s1.createQuery("from Person");//no need to specify package
		List<Person> list = query.list();
		for(Person p1 : list)
		{
			System.out.print(p1.getId() + "\t");
			System.out.print(p1.getFirstName() + "\t");
			System.out.print(p1.getLastName() + "\t");
			System.out.println(p1.getAge());
		}
		
	}

}
//if clinet program and perosn program are in same package no need to specify package
//here we are reading every column and every row