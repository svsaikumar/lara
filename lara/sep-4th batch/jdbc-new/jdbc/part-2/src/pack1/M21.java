//package pack1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class M21
{
	public static void main(String[] args)
	{
		//1.registering the driver
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
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
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String un = "system";
			String pw = "Oracle123";
					//2.Establishing database connection
			con = DriverManager.getConnection(url, un, pw);//need sql ex
					//3.create statemnt
			stmt = con.createStatement();//need sql ex
					//4.compose sql command
			String sql = "select * from person";//no need sql ex
					//5.triggering sql command
			rs = stmt.executeQuery(sql);//need sql ex
			ResultSetMetaData rsmd =  rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for(int i = 1; i <= cols; i++)
			{
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			System.out.println("===================");
			while(rs.next())
			{
				for(int i = 1; i <= cols; i++)
				{
					System.out.print(rs.getString(i) + "\t");
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
			//6.close data base connection
			try
			{
				if(rs!= null)
				{
					rs.close();//need sql ex
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
					stmt.close();//need sql ex
					stmt = null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con != null)
				{
					con.close();//need sql ex
					con = null;
				}
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}//end of finally
		System.out.println("done");
	}
}
//first we have to close statement then only close the connection
//we can treat statement is child to connection
//one try catch for one reosurce
//don't close all resources in one try-catch
//no need to close ResultSetMetaData as it is not a data base(it is taken from ResultSet only)
//it is not closeable type.