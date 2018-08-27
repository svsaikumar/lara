package com.lara;

import java.io.PrintWriter;

import org.hibernate.Session;


public class M2 
{
	public static void main(String[] args) 
	{
		
		
		Session session = Util.getSession();
		Employee s1 = (Employee)session.get(Employee.class, 1);
		System.out.println("");
	}
	

}
