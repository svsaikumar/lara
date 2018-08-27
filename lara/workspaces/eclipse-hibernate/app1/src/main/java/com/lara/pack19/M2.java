package com.lara.pack19;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class M2 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Person p1 = (Person) session.load(Person.class, 101);
		System.out.println(p1.getFirstName());
		
		
		//session.clear();by using this method we can clear the entire  session object
		session.evict(p1);//removing only p1 object from session object which is already available
		
		
		System.out.println("===================");
		Person p2 = (Person) session.load(Person.class, 101);
		System.out.println(p2.getFirstName());
		System.out.println("===================");
	}
}
//here select command is executing only one time, although we load Person class two times
//Because while first time loading, Person is storing in session object 
//while calling 2nd time , it is taking Person object from session object , not from database
//session object is acting as a cache memory(consider it a first level cache)
//in order to achieve first level cache , we don't request to configure any thing , by default it is available
//first level cache is session object wise
//by using evit() we can clear the specific object from session object
//by using clear() we can clear the entire cache from session object