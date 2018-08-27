package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M29 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String hql = "select age, firstName, lastName from Person";
		
		Query query = s1.createQuery(hql);
		System.out.println(query + "=query");
		List<Object[]> list = query.list();
		for(Object[] record : list)
		{
			for(int i = 0; i < record.length; i++)
			{
				System.out.print(record[i] + "\t");
			}
			System.out.println();
		}
	}
}
//reading multiple columns from table
//Object Arrays are returning to the list
//if we are reading more than one column, use object type to store the values