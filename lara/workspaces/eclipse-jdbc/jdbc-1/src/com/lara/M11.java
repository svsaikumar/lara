package com.lara;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M11{

	public static void main(String[] args) 
	{
		
		
		String sql = "SELECT ID, NAME, AGE, SALARY FROM EMP1";
		int i = ResultSet.TYPE_SCROLL_SENSITIVE;
		int j = ResultSet.CONCUR_UPDATABLE;
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement(i,j);
			ResultSet rs = stmt.executeQuery(sql))
		{
			if(rs.absolute(5))//cursor is going to 5th record from top
			{
				rs.updateInt(3, 45);//modifying 3rd column
				rs.updateString(2, "NAVEEN");//modifying 2nd column
				rs.updateRow();
			}//all modifications are applying for 5th record
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//updatable and scroll both should be used at a time
//while scrolling we can update also
