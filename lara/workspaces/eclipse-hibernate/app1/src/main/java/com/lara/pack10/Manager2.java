package com.lara.pack10;

import org.hibernate.Session;

import com.lara.Util;

public class Manager2
{
	
	public static void main(String[] args) 
	{
		Session session = Util.getSession();
		Student s1 = (Student) session.load(Student.class, 101);
		session.beginTransaction();
		session.delete(s1);
		session.getTransaction().commit();
		System.out.println("done");
	}
}
