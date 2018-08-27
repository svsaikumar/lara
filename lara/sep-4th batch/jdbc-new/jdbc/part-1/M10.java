import java.sql.*;
import java.io.*;
class  M10
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt = con.createStatement();
		//String sql = "DELETE FROM PERSON WHERE ID = 4";
		String sql = "DELETE FROM book1 WHERE ID = 3";
		stmt.execute(sql);
		System.out.println("done");
	}
}