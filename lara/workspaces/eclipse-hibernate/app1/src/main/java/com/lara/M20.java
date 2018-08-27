package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class M20
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		ctr.setFirstResult(2);//from 2nd record
		ctr.setMaxResults(5);//5 records
		
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
// 0 is first