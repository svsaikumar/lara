package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M23
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		
		Query query = s1.createQuery("from Person where firstName like '%s%'");
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
//here we are reading specific columns by using attrubute name(firstName)
//we should not use column name to read columns