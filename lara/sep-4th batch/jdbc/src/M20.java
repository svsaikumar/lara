import java.sql.*;
import java.io.*;
import java.util.*;
class M20
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		DatabaseMetaData dbmd =con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductName());
		
	}
}
