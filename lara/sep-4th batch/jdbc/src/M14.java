import java.sql.*;
import java.io.*;
class M14
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String sql = "SELECT ID FROM TEST101";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.print(rs.getString("id") + "\t");
			System.out.println(rs.getString("id"));
		}
	}
}
