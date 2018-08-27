package com.lara.pack17;



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
		
		
		Student st1 = new Student();
		st1.setFirstName("Kiran");
		st1.setLastName("vijay");
		
		
		Batch b1 = new Batch();
		b1.setTitle("regular");
		b1.setDuration(200);
		
		Batch b2 = new Batch();
		b2.setTitle("crash");
		b2.setDuration(100);
		
		b1.addStudent(st);
		b1.addStudent(st1);
		
		b2.addStudent(st);
		b2.addStudent(st1);
		
		
		Transaction t = session.beginTransaction();
		session.persist(st);
		session.persist(st1);
		session.persist(b1);
		session.persist(b2);
		t.commit();
		System.out.println("done");
		
		
	}

}
//while addig stduent o batfch , batch also adding to student
//we have to save both student s and batches
