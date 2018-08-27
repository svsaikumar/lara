package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M21
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		
		Query query = s1.createQuery("from com.lara.Person");//it is hbl
		List<Person> list = query.list();
		for(Person p1 : list)
		{
			System.out.print(p1.getId() + "\t");
			System.out.print(p1.getFirstName() + "\t");
			System.out.print(p1.getLastName() + "\t");
			System.out.println(p1.getAge());
		}
		
	}
}

//there is a another way to read multiple records
//hbl = hibernate query language

	//in hbl, we have to use class name in the place of table name
	//we have to use attribute name of class in place of column name of the table
//sql = structured query language

//if we are reading all columns, select should not be used