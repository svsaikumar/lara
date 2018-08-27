//package pack1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

class M20
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
			String sql = "Insert into person values(" + "21, 'Manohar', 35)";//no need sql ex
			//5.triggering sql command
			stmt.execute(sql);//need sql ex
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
//one try catch for one resource
//don't close all resources in one try-catch