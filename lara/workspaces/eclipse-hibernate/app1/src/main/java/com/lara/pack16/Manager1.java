package com.lara.pack16;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lara.Util;
import com.lara.pack14.Mail;
import com.lara.pack14.Student;

public class Manager1
{
	public static void main(String[] args) 
	{
		
		
		Session session = Util.getSession();
		Student st = new Student();
		st.setId(1);
		st.setFirstName("Ramu");
		st.setLastName("vijay");
		
		Mail m1 = new Mail();
		m1.setId(2);
		m1.setUsername("abc@gmail.com");
		m1.setPassword("12345");
		m1.setStudent(st);
		
		
		Mail m2 = new Mail();
		m2.setId(2);
		m2.setUsername("hello@gmail.com");
		m2.setPassword("678910");
		m2.setStudent(st);
		
		Transaction t = session.beginTransaction();
		session.persist(st);
		session.persist(m2);
		t.commit();
		System.out.println("done");
	}
}
