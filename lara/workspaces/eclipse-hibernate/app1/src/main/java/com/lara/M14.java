package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class M14
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		
		Criteria ctr = session.createCriteria(Person.class);
		
		ctr.add(Restrictions.gt("age", 22));
		
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
//here we adding restrictions
//any number of restriction can be added
//there are several methods udner 'Restrictions' class
//'gt' stands for greater than(>)