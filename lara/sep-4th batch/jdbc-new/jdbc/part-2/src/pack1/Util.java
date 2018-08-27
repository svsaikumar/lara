//package pack1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;


class Util
{
	public static Connection getConnection() throws SQLException 
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
		try
		{
			Class.forName(driver);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Connection con = DriverManager.getConnection(url, un, pw);
		System.out.println("con:" + con);
		return con;
	}
}
//to interact with the database	connection obejct is required
//connectin objet internally depending on 4 objects(driverclass, url, username, password) 
//using that objects to establish the connection
