package com.lara;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.Exception;

public class M2 
{
	public static void main(String[] args) throws Exception
	{
		String sql = "CREATE TABLE EMP1(ID NUMBER PRIMARY KEY, NAME VARCHAR2(90), AGE NUMBER, SALARY NUMBER, PIC BLOB)";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
		{
			stmt.execute(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
 	BLOB is one of the data type
 */
