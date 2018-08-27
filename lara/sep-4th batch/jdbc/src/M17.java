import java.sql.*;
import java.io.*;
class M17
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
		while(rs.next())
		{
			for(int i = 1; i <= cols; i++)
			{
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		
	}
}
