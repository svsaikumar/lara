package com.lara;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M5 
{
	public static void main(String[] args) 
	{
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Person p1 = new Person();
		p1.setId(104);
		p1.setFirstName("manu");
		p1.setLastName("test");
		p1.setAge(26);
		
		
		session.beginTransaction();
		
		session.persist(p1);
		session.getTransaction().commit();
		
		System.out.println("person saved");
	}
}

//persist() method return type is void-it will simply save in the data base, it won't return anything
//if we want id to be return, use save() method


//difference between save and persist methods is save() return id column value, whereas persis() method return nothing
