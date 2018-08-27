package com.lara.pack19;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M1
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Person p1 = new Person();
		p1.setId(101);
		p1.setFirstName("Ramu");
		p1.setLastName("xyz");
		p1.setAge(22);
		
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
		System.out.println("done");
	}

}
