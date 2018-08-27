package com.lara.pack2;

import org.hibernate.Session;

import com.lara.Util;

public class M1
{

	public static void main(String[] args) 
	{
		
		
		PersonPK personPk = new PersonPK();
		personPk.setFirstName("abc");
		personPk.setEmail("abc@abc.com");
		
		
		Person p1 = new Person();
		p1.setPersonPK(personPk);
		p1.setLastName("xyz");
		p1.setAge(23);
		
		

		Session session = Util.getSession();
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
		
		System.out.println("done");

	}

}
//wherver subclass is assingning to super class refernece, it is polymorphic
