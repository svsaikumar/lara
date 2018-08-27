package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class M17 
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		
		Criterion c1 = Restrictions.gt("age", 22);//(age > 22)-one boolean condition
		Criterion c2 = Restrictions.like("firstName", "%m%");//(firstName like "%m%)-one boolean condition
		ctr.add(c1);//adding one boolean condition
		ctr.add(c2);//adding one boolean condition
		
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
//Criteria representing one table(through one pojo class)
//criterion representing one boolean condition(reprsenting one WHERE class)
//we can add any number of criterions to the Criteria

//here we are adding c1 and c2(AND condition)
//by default every Criterion is adding to Criteria(AND condition)
