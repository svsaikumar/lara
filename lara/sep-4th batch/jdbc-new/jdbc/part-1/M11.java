import java.sql.*;
import java.io.*;
class  M11
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);//FOR DDL WE REQUIRED executeQuery() method
		while(rs.next())//checking next record is there or not in the table
		{
			System.out.print(rs.getInt("id") + ",");
			System.out.print(rs.getString("name") + ",");
			System.out.print(rs.getInt("age"));
			System.out.println();
		}
		System.out.println("done");
	}
}
//reading the data from the resultSet by using different methods which are available in resultset class
//inside resultset there is cursor(initially cursor will be top of result set)