package com.lara;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class M20
{
	public static void main(String[] args) 
	{
		
		
		String s1 = "INSERT INTO BOOK1(ID, TITLE) VALUES(9001,'ABC')";
		String s2 = "INSERT INTO BOOK1(ID, TITLE) VALUES(9002,'xyz')";
		String s3 = "INSERT INTO BOOK1(ID, TITLE) VALUES(9003,'test)";//error in s3
		String s4 = "INSERT INTO BOOK1(ID, TITLE) VALUES(9004,'java')";
		Connection con = null;
		Statement stmt = null;
		Savepoint sp1 = null;
		Savepoint sp2 = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate(s1);//here s1 is saving permanently as save point is after SavePoint
			System.out.println("===========");
			sp1 = con.setSavepoint("firstSavePoint");
			System.out.println("===========");
			System.out.println(s2);
			sp2 = con.setSavepoint("secondSavePoint");
			System.out.println("===========");
			stmt.executeUpdate(s3);
			System.out.println("===========");
			stmt.executeUpdate(s4);
			System.out.println("===========");
			con.commit();
		}
		catch(SQLException ex)
		{
			System.out.println("some exception");
			try
			{
				if(con != null)
				{
					con.rollback(sp2);//from sp onwards rollback is happening(before sp rollback is not happening)
				}
		    }
			catch(SQLException ex1)
			{
				ex1.printStackTrace();
			}
		}
		finally
		{
			try
			{
				if(stmt != null)
				{
					stmt.close();
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con != null)
				{
					con.close();
				}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	} 
}
//savecpoint = 
//customizing transaction
