package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class M15 
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		
		Criteria ctr = session.createCriteria(Person.class);
		
		ctr.add(Restrictions.gt("age", 22));
		ctr.add(Restrictions.like("firstName", "%m%"));
		List<Person> list = ctr.list();
		
		for(Person p1 : list)
		{
			System.out.print(p1.getId() + "\t");
			System.out.print(p1.getFirstName() + "\t");
			System.out.print(p1.getLastName() + "\t");
			System.out.println(p1.getAge());
		}

	}
}
//we should not use columns names, we have to use only attribute names as argument for calling methods of 'Restrictions' class
//any number of restrictions can be applied