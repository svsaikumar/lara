package com.lara.pack19;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M3 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session1 = sf.openSession();
		
		Person p1 = (Person) session1.load(Person.class, 101);
		System.out.println(p1.getFirstName());
		System.out.println("===================");
		
		
		Session session2 = sf.openSession();
		
		Person p2 = (Person) session2.load(Person.class, 101);
		System.out.println(p2.getFirstName());
		System.out.println("===================");
	}
}
//we are 2 different session objects
//session1 object data is not available to session2 object and vice versa

//2nd level cache is availability of one session object data  to all the sessin objects