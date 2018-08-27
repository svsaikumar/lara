import java.sql.*;
import java.io.*;
import java.util.*;
class M22
{
	public static void main(String[] args) throws Exception
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "Oracle123";
		try
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try
		{
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			String sql = "SELECT * FROM TAB531";
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getInt(1) + "\t");
				System.out.println(rs.getString(2));
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
				if(rs != null)
				{
					rs.close();
					rs = null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(stmt != null)
				{
					stmt.close();
					stmt = null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
