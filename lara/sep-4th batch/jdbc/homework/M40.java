import java.sql.*;
import java.io.*;
import java.util.*;
class  M40
{
	public static void main(String[] args) 
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="Oracle123";
		Connection con =null;
	    DatabaseMetaData dbmd=null;
				try
		{
			Class.forName(driverClass);//driver registration 
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		try
		{
		con=DriverManager.getConnection(url,username,password);
		 dbmd = con.getMetaData();
		System.out.print(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductName());
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(con!=null)
				{
				con.close();
					con=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("done");
		}
	}
}