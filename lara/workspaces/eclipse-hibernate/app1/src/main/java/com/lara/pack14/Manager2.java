package com.lara.pack14;

import org.hibernate.Session;

import com.lara.Util;

public class Manager2 
{
	public static void main(String[] args) 
	{
		Session session = Util.getSession();
		Student s1 = (Student) session.load(Student.class,1);
		System.out.println(s1.getFirstName());
		Mail[] mails = s1.getMails();
		for(Mail mail : mails)
		{
			System.out.println(mail.getUsername());
			System.out.println(mail.getPassword());
		}
		System.out.println();
		System.out.println("done");
	}
}
