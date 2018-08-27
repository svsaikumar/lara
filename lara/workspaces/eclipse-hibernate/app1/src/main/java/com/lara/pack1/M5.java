package com.lara.pack1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.lara.Util;

public class M5 
{
	public static void main(String[] args) 
	{
	
		Session session = Util.getSession();
		Query query = session.createQuery("from Person where address.streetName = 'BTM'");
		
		List<Person> list = query.list();
		for(Person p1: list)
		{
			System.out.print(p1.getId() + "\t");
			System.out.print(p1.getFirstName()+ "\t");
			System.out.print(p1.getLastName()+ "\t");
			System.out.print(p1.getAddress().getHouseNo()+ "\t");
			System.out.println(p1.getAddress().getStreetName());
		}	
		System.out.println("done");
	}

}
//in query api we shold not use table names or columns names for query-api
//composite promery key  = making