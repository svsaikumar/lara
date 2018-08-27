package com.lara;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M7 
{
	public static void main(String[] args) 
	{
		String sql = "SELECT ID, NAME, AGE, SALARY FROM EMP1";
		int i = ResultSet.TYPE_SCROLL_SENSITIVE;
		int j = ResultSet.CONCUR_UPDATABLE;
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement(i,j);
			ResultSet rs = stmt.executeQuery(sql))
		{
			System.out.println("reading 3rd record");
			if(rs.absolute(3))//straight away cursor is reaching the 3rd record
			{
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getInt(3) + "\t");
				System.out.print(rs.getInt(4));
				System.out.println();
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//in jdbc 2.0 new feature scrollable result set
//we have to supply to constants from result set to connection
//initially cursor will be in top of the result set
