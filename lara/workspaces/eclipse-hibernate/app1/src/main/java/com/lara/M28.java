package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M28
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String hql = "select age from Person";
		
		Query query = s1.createQuery(hql);
		System.out.println(query + "=query");
		List<Integer> list = query.list();
		for(Integer str : list)
		{
			System.out.println(str + "\t");
		}
	}
}
//we have to specify attribute name not column name