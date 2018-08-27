package com.lara.pack1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Session;

import com.lara.Util;

public class M4 
{
	public static void main(String[] args) 
	{
	
		Session session = Util.getSession();
		
		Criteria ctr = session.createCriteria(Person.class);
		ctr.add(Restrictions.eq("address.houseNo", "123/c"));
		List<Person> list = ctr.list();
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
//create criteria returns the instance of a particular class