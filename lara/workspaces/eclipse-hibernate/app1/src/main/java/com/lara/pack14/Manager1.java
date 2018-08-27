package com.lara.pack14;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lara.Util;

public class Manager1
{	
	public static void main(String[] args) 
	{
		
		Session session = Util.getSession();
		Student st = new Student();
		st.setFirstName("Ramu");
		st.setLastName("vijay");
		
		Mail m1 = new Mail();
		m1.setUsername("abc@gmail.com");
		m1.setPassword("12345");
		m1.setStudent(st);
		
		
		Mail m2 = new Mail();
		m2.setUsername("hello@gmail.com");
		m2.setPassword("678910");
		m2.setStudent(st);
		
		st.setMails(new Mail[] {m1, m2});
		Transaction t = session.beginTransaction();
		session.persist(st);
		session.persist(m2);
		t.commit();
		System.out.println("done");
		
	}

}
