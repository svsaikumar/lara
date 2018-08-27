package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M6 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Person p1 = new Person();
		p1.setId(105);
		p1.setFirstName("manu");
		p1.setLastName("check");
		p1.setAge(29);
	
	
		session.beginTransaction();
		
		session.update(p1);
		session.getTransaction().commit();
		
		System.out.println("person saved");
	}
}
//update() method is modifying the existing record in the data base
//saveOrUpdate() method modify's if record is available', it recored is not available, it is creating new record


//if we use update()