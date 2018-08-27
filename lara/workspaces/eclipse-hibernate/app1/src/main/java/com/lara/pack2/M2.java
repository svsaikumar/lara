package com.lara.pack2;

import org.hibernate.Session;

import com.lara.Util;

public class M2 
{
	
	
	
	
	public static void main(String[] args) 
	{
		
		Session session = Util.getSession();
		PersonPK pk = new PersonPK();
		pk.setFirstName("abc");
		pk.setEmail("abc@abc.com");
		
//		Person p1 = (Person) session.load(Person.class, pk);
//		System.out.print(p1.getPersonPK().getFirstName());
//		System.out.print(p1.getPersonPK().getEmail());
//		System.out.print(p1.getLastName());
//		System.out.print(p1.getAge());
		System.out.println("done");
	}
}
