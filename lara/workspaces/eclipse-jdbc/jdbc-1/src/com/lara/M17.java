package com.lara;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class M17
{
	public static void main(String[] args)
	{
		String s1 ="INSERT INTO BOOK1 VALUES(?, ?, ?, ?)";
		try(Connection con = Util.getConnection();
				PreparedStatement pstmt = con.prepareStatement(s1))
		{
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();
			System.out.println(count);
			pstmt.setInt(1, 5000);
			pstmt.setString(2,"Java");
			pstmt.setString(3,"MOHAN");
			pstmt.setInt(4, 5000);
			pstmt.executeUpdate();
			System.out.println("done");
		}
		catch(SQLException ex) 
		{
			ex.printStackTrace();
	    }
	}
}
//ParameterMetaData = only for identifying the meta data of parameters
//in jdbc 3 meta data are available = , resultset meta data,data base meta data, parameter meta data
//databasemetadata = meta dataof the driver and teh data type
//resultsetmetadata =meta data of result set
//parametersmetadatq = meta data of parameters of sql command of preparedstatement
