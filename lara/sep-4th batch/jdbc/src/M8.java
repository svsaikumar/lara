import java.sql.*;
import java.io.*;
class M8
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
			System.out.print(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2));
		}
	}
}
