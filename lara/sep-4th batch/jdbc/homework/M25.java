import java.sql.*;
class  M25
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
			String s1 ="INSERT INTO TAB209 VALUES(7,'manu')";
		    String s2 ="UPDATE TAB208 SET FIRST_NAME='KUMAR' WHERE ID=3";
		    String s3 ="DELETE FROM TAB208 WHERE ID=5";
         stmt.execute(s1);
			stmt.execute(s2);
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
/*
==>always advisable to try catch rather than throws
==>initially 4 attributes
==>we have to use finnaly to close
==>con should be declared before the try bcz method s which are declared in try should local to that it self
==>*/