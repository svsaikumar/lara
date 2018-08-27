package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M33 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		
		Query query = s1.getNamedSQLQuery("sql1");
		
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
//we can read sql command from any hbm file