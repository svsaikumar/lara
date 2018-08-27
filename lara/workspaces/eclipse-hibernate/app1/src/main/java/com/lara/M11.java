package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M11 
{
	public static void main(String[] args) 
	{
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			
			//Person p1 = (Person) session.get(Person.class, 109);
			Person p1 = (Person) session.load(Person.class, 109);
			
		
			System.out.println("person :" + p1);

	}
}
//if we use get() method, it is returning null value if that record is not available
//if we use load() method , it is rising an exception(object not found ex) if that record is not available

//if we are sure about the record use load method
//if not use load method