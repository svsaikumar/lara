import java.sql.*;
class  M35
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
		ResultSet rs=null;
			ResultSetMetaData rsmd=null;
			 int cols=0;
		String c1 = null;
		String c2= null;
		try
		{
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			String sql="SELECT *  FROM TAB531";//we can read any no of times
		  rs = stmt.executeQuery(sql);
          rsmd = rs.getMetaData();
		    cols=rsmd.getColumnCount();
		    c1 = rsmd.getColumnName(1);
		  c2= rsmd.getColumnName(2);
	
	System.out.println(cols);
	System.out.println(c1);
	System.out.println(c2);

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