import java.sql.*;
import java.io.*;
class M9
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String sql = "SELECT * FROM TEST101";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt("id") + "\t");
			System.out.println(rs.getString("first_name"));
		}
	}
}
