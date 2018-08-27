package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M27 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String hql = "select firstName from Person";
		
		Query query = s1.createQuery(hql);
		System.out.println(query + "=query");
		List<String> list = query.list();
		for(String str : list)
		{
			System.out.println(str + "\t");
		}
	}
}
//firstName is a type of string