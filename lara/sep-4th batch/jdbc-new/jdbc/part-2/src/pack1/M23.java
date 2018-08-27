//package pack1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

class M23
{
	public static void main(String[] args)
	{
		Properties pr = new Properties();
		try(FileReader fin = new FileReader("db.properties"))
		{
			pr.load(fin);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		String driver = pr.getProperty("driverClassName");
		String url = pr.getProperty("url");
		String un = pr.getProperty("username");
		String pw = pr.getProperty("password");
		//1.registering a driver
		try
		{
			Class.forName(driver);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
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
			