import java.sql.*;
import java.io.*;
import java.util.*;
class  M39
{
	public static void main(String[] args) 
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="Oracle123";
		Connection con =null;
		Statement stmt=null;
		ResultSet rs=null;
		ResultSetMetaData rsmd=null;
		int cols=0;
		String c1 = null;
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
				stmt=con.createStatement();
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter taable name");
		        String sql="SELECT * FROM " + name;
				rsmd = rs.getMetaData();
				cols=rsmd.getColumnCount();
				while (rs.next())//iterating row by row
					{
						  for (int i=1;i<=cols;i++ )//readinng column by column
						  {
							  System.out.print(rs.getString(i) +"\t");
						  }
							System.out.println();
					 }
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
					rs=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
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