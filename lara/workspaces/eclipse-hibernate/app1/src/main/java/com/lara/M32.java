package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M32 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String sql = "select first_name, last_name  from PERSON where first_Name like '%s%' ";//raw sql command
		
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
//we can't use insert, update , delete command is not supported under api - in hibernate