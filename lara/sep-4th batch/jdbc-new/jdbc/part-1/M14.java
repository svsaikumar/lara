import java.sql.*;
import java.io.*;
class  M14
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt = con.createStatement();
		String sql = "SELECT age, name FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getString(1) + ",");
			System.out.print(rs.getString(2) + ",");
			System.out.println();
		}
		System.out.println("done");
	}
}