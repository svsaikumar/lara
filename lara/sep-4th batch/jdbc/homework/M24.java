import java.sql.*;
class  M24
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
			String s1 ="INSERT INTO TAB209 VALUES(2,'SAM')";
		String s2 ="INSERT INTO TAB208 VALUES(3,'SUMA')";
		String s3 ="INSERT INTO TAB208 VALUES(4,'ANU')";
		String s4 ="INSERT INTO TAB208 VALUES(5,'LAMU')";
		String s5 ="INSERT INTO TAB208 VALUES(6,'SAMU')";
			stmt.execute(s1);
			stmt.execute(s2);
			stmt.execute(s3);
			stmt.execute(s4);
			stmt.execute(s5);
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