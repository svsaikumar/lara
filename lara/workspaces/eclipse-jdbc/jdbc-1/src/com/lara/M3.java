package com.lara;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class M3 
{
	public static void main(String[] args) 
	{
		String sql1 = "INSERT INTO EMP1(ID, NAME, AGE, SALARY) VALUES(1, 'RAMU', 22, 50000)";
		String sql2 = "INSERT INTO EMP1(ID, NAME, AGE, SALARY) VALUES(2, 'KIRAN', 24, 60000)";
		String sql3 = "INSERT INTO EMP1(ID, NAME, AGE, SALARY) VALUES(3, 'MURALI', 21, 40000)";
		String sql4 = "INSERT INTO EMP1(ID, NAME, AGE, SALARY) VALUES(4, 'MOHAN', 23, 25000)";
		String sql5 = "INSERT INTO EMP1(ID, NAME, AGE, SALARY) VALUES(5, 'RAVI', 27, 55000)";
		String sql6 = "INSERT INTO EMP1(ID, NAME, AGE, SALARY) VALUES(6, 'SWETHA', 20, 50000)";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
		{
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			stmt.executeUpdate(sql3);
			stmt.executeUpdate(sql4);
			stmt.executeUpdate(sql5);
			stmt.executeUpdate(sql6);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
