package com.lara.pack13;

import org.hibernate.Session;

import com.lara.Util;

public class Manager2 
{
	public static void main(String[] args) 
	{
		Session session = Util.getSession();
		Mail m1 = (Mail) session.load(Mail.class,1);
		System.out.println(m1.getUsername());
		System.out.println(m1.getPassword());
		
		Student s1 = m1.getStudent();
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());
		System.out.println("done");
	}
}
