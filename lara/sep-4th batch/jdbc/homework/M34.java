import java.sql.*;
class  M34
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
		try
		{
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			String sql="SELECT ID  FROM TAB531";
		 rs = stmt.executeQuery(sql);
		while(rs.next())		
			{
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id"));
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