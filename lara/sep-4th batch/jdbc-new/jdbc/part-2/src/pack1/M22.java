//package pack1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class M22
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
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String un = "system";
		String pw = "Oracle123";
		String sql = "select * from person";

		try(Connection con = DriverManager.getConnection(url, un, pw);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql))
			{

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
			catch (SQLException  ex)
			{
				ex.printStackTrace();
			}
			System.out.println("done");
	}
}
//auto resoruce closing(from jdk1.7)
//we can only open closeable resources in try paranthesis
//we can open any numebr of resorces in try by using semi-colon(;) as a separator
//once try-execution got over all the resources are automatically closing
//here no need of closing reources explicilty as they are automatically closing