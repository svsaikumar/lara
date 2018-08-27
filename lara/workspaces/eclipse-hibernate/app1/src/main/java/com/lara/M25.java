package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M25
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String hql = "from Person order by lastName";
		
		Query query = s1.createQuery(hql);
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
