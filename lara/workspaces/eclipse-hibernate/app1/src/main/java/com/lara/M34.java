package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class M34 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		
		Query query = s1.getNamedSQLQuery("sql2");
		
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
//in case of sql(hibenate), we can develop sql query in java program or in hbm file