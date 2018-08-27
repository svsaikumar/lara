import java.sql.*;
import java.util.*;
class  M27
{
	public static void main(String[] args) 
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="Oracle123";
		try
		{
			Class.forName(driverClass);//driver registration 
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Connection con =null;
		Statement stmt=null;
		try
		{
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
      Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		String s1=sc.next();
		System.out.println("enter name");
        String s2=sc.next();
		String s3= 
			"INSERT INTO TAB209 VALUES(" + s1 +" ,'" + s2 + "')"; 
		stmt.execute(s3);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
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