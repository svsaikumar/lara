package com.lara;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M4 
{

	public static void main(String[] args) 
	{
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Person p1 = new Person();
		p1.setId(103);
		p1.setFirstName("ramu");
		p1.setLastName("chinnu");
		p1.setAge(28);
		
		
		session.beginTransaction();
		
		Serializable id = session.save(p1);
		session.getTransaction().commit();
		
		System.out.println("person saved with id as:" + id);
	}

}
//save method return type is serializable
//id of person object is going to id variable of type serializable
//Integer class is subclass to serializable
//every wrapper class is subclass to serializable
