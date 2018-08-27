package com.lara;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class M15 
{
	public static void main(String[] args) 
	{
		
		
		String s1 = "INSERT INTO EMP1(ID,PIC) VALUES(?,?)";
		File f1=new File("S:\\MI\\164.jpg");
		int length = (int) f1.length();
		byte[] bytes = new byte[length];
		try(Connection con = Util.getConnection();
			PreparedStatement pstmt = con.prepareStatement(s1);
			FileInputStream fin = new FileInputStream(f1);
			BufferedInputStream bin = new BufferedInputStream(fin))
		{
			bin.read(bytes);
			pstmt.setInt(1,201);
			pstmt.setObject(2,bytes);
			pstmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//batch updates = batch of updatable sql commands(for same table or different sending to the database through a single network flow 
//output [1,1,1,1] = represents four records are updated by the commands in the data base
//exceute() = return type is boolean (DDL)
//executeQuery() = return type is ResultSet(DQL)
//executeUpdate()= return type is int(DML)
//executeBatch() = return type is int[] 
//("S:\\MI\\164.jpg");
