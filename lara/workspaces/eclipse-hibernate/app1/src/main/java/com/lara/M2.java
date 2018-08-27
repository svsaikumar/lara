package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M2 {

	public static void main(String[] args) 
	{
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		System.out.println(session);
		System.out.println("done");
		
	}

}
