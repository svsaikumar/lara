package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M9 
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
		
		session.delete(p1);
		
		session.getTransaction().commit();
		
		System.out.println("person deleted");

	}

}
//if record is available it will delete the record
//if record is not available then it won't call delete() method