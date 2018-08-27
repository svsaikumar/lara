package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class M16
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		
		List<Person> list =  session.createCriteria(Person.class)
									.add(Restrictions.gt("age", 22))
									.add(Restrictions.like("firstName", "%m%"))
									.list();
		
		for(Person p1 : list)
		{
			System.out.print(p1.getId() + "\t");
			System.out.print(p1.getFirstName() + "\t");
			System.out.print(p1.getLastName() + "\t");
			System.out.println(p1.getAge());
		}

	}

}
