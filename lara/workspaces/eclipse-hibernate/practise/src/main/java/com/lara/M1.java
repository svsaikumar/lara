package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M1 {

	public static void main(String[] args)
	{
		
		Salary s1 = new Salary();
		s1.setGross(10000);
		s1.setNet(12000);
		
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("saikumar");
		e1.setAge(10);
		e1.setCity("banglore");
		e1.setSalary(s1);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();	
	}
}
