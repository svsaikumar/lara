package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M30
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		String sql = "select * from PERSON";//raw sql command
		
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
//reading records using sql command
//we can supply raw sql command
//here we have to use , table name only not class name(while sql command)