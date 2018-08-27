package com.lara.pack13;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lara.Util;

public class Manager1
{	
	public static void main(String[] args) {
		
		
		Session session = Util.getSession();
		Student st = new Student();
		st.setFirstName("Ramu");
		st.setLastName("vijay");
		
		Mail m1 = new Mail();
		m1.setUsername("abc@gmail.com");
		m1.setPassword("123456");
		m1.setStudent(st);
		
		
		Mail m2 = new Mail();
		m2.setUsername("hello@gmail.com");
		m2.setPassword("123456");
		m2.setStudent(st);
		
		Transaction t = session.beginTransaction();
		session.persist(m1);
		session.persist(m2);
		t.commit();
		//session.flush();
		session.close();
		System.out.println("done");
		
		
		
	}

}
