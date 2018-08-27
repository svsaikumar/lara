package com.lara;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M13
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
			rs.moveToInsertRow();
			rs.updateInt(1, 8);
			rs.updateString(2, "NARESH");
			rs.updateInt(3, 38);
			rs.updateInt(4, 46000);
			rs.insertRow();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//here cursor is not pointing to any record
