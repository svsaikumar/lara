package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class M18
{
	public static void main(String[] args) 
	{
		
		Session session =  Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		
		Criterion c1 = Restrictions.gt("age", 22);//(age > 22)-one boolean condition
		Criterion c2 = Restrictions.like("firstName", "%m%");//(firstName like "%m%)-one boolean condition
		Criterion c3 = Restrictions.or(c1,c2);//OR condition//considering any of the two boolean conditions c1, c2
		ctr.add(c3);//one boolean condition
		
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
//in place of table name specify pojo class name
//in place of column name specify attribute name

//we need to change only hbm file, no need to change any other 
//whenever table name or  column names are changing modify in hbm file only(no need to modify remaining files(i.e java))