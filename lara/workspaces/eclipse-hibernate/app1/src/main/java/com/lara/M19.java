package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class M19 
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		
		ctr.addOrder(Order.asc("lastName"));
		List<Person> list =  ctr.list();
		for(Person p1 : list)
		{
			System.out.print(p1.getId() + "\t");
			System.out.print(p1.getFirstName() + "\t");
			System.out.print(p1.getLastName() + "\t");
			System.out.println(p1.getAge());
		}

	}

}
