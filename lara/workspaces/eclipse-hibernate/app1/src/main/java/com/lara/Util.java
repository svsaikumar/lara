package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util 
{
	

	
	
	private static SessionFactory sf;
	static
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
	}
	
	public static Session getSession()
	{
		Session session = sf.openSession();
		return session;
	}
}
