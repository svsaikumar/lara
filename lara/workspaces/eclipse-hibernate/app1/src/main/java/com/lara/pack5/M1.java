package com.lara.pack5;

import org.hibernate.Session;

import com.lara.Util;

public class M1 
{
	public static void main(String[] args) 
	{
		
		
		
		Person p1 = new Person();
		p1.setId(101);
		p1.setFirstName("Ramu");
		p1.setLastName("Kumar");
		
		
		Employee e1 = new Employee();
		e1.setId(102);
		e1.setFirstName("Ramu");
		e1.setLastName("Kumar");
		e1.setEmail("r@r.com");
		e1.setSalary(50000);
		
		
		PermanentEmployee pe1 = new PermanentEmployee();
		pe1.setId(103);
		pe1.setFirstName("Ramu");
		pe1.setLastName("Kumar");
		pe1.setEmail("r@r.com");
		pe1.setSalary(50000);
		pe1.setDesignation("software engineer");
		pe1.setLeaves(15);
		
		
		Session s1 = Util.getSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.save(e1);
		s1.save(pe1);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
//<mapping class="com.lara.pack4.PermanentEmployee"/>