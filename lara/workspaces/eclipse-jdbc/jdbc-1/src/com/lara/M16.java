package com.lara;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M16 
{
	public static void main(String[] args) 
	{
		String s1 = "SELECT PIC FROM EMP1 WHERE ID= 201";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery(s1);
			FileOutputStream fout = new FileOutputStream("test.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(fout))
		{
			if(rs.next())
			{
				Blob blob = rs.getBlob("PIC");
				byte[] bytes = blob.getBytes(1,(int)blob.length());
				bout.write(bytes);
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}

}
