package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M31
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String sql = "select * from PERSON where first_Name like '%s%' ";//raw sql command
		
		Query query = s1.createSQLQuery(sql);
		
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
//we have to use sql systax only in commands