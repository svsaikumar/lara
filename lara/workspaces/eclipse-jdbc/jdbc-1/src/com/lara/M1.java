package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class M1
{
	
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String sql = "INSERT INTO TEST101 VALUES(1000)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
