package com.lara.pack8;

import org.hibernate.Session;

import com.lara.Util;

public class Manager2
{
	
	public static void main(String[] args) 
	{
		Session session = Util.getSession();
		Student s1 = (Student) session.load(Student.class, 1);
		session.beginTransaction();
		session.delete(s1);
		session.getTransaction().commit();
		System.out.println("done");
	}
}
//because of cascade =all, it is deleting in both tables
//while student is loading, address also loading
//address record is child record and deleting from student