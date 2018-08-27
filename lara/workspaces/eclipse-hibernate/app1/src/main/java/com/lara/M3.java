package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M3 {

	public static void main(String[] args) 
	{
		
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Person p1 = new Person();
		p1.setId(101);
		p1.setFirstName("saikumar");
		p1.setLastName("venkata");
		p1.setAge(20);
		
		
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
		
		System.out.println("done");


	}

}
//<!-- interacting with hibernate is nothing but calling methods from  the session objects -->
