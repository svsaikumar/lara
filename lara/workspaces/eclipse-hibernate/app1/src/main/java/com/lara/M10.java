package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M10 
{
	public static void main(String[] args) 
	{
		
		
		
		
		
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			
		//	Person p1 = (Person) session.get(Person.class, 101);
		Person p1 = (Person) session.load(Person.class, 101);
			
			System.out.println(p1.getId());
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());
			
			System.out.println("person read");

	}
}
//get() method = first displaying query and then values
		//sql command is triggering immediately
		//records is reading from the database immediately
//load() methods = first displaying primary key column and query and then remaining values
		//select command is not triggering immediately(lazy loading)
		//creating one person object with given column value(returnin by load method)
		//