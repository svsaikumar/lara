import java.sql.*;
import java.io.*;
class M15
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String sql = "SELECT * FROM TEST101";
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		String c1 = rsmd.getColumnName(1);
		String c2 = rsmd.getColumnName(2);
		System.out.println(cols);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
