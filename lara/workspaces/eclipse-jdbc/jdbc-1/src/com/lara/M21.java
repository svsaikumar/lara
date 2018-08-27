package com.lara;
/*

	create table EMP3(ID NUMBER, NAME VARCHAR2(90), ROW_ID ROWID);
*/
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M21 
{
	public static void main(String[] args) 
	{
		
		
		String s1 ="INSERT INTO EMP3(ID, NAME) VALUES(1,'ABC')";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
		{
			stmt.executeUpdate(s1, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = stmt.getGeneratedKeys();
			String rowId = null;
			if(rs.next())
			{
				rowId = rs.getString(1);
			}
			s1 = "UPDATE EMP3 SET ROW_ID = '" + rowId + "' WHERE ID = 1";
			stmt.executeUpdate(s1);
			System.out.println("done");
		}
		catch(SQLException ex)
		{
			for(Throwable t : ex)
			{
				System.out.println(t);
			}
		}
	}
}
//Whenever we are inserting into data, we are updating that record with ROW_ID
//inorder to interact with microsoft office, we need POI library(poor obfuscation implementation)
//this library was open source and was developed by apache
