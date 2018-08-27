import java.sql.*;
import java.io.*;
class  M17
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt = con.createStatement();
		String sql = "SELECT id p_id, age person_age FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();//one of the method to get meta data
		System.out.println(rsmd.getColumnCount());
		System.out.print(rsmd.getColumnName(1));
		System.out.print("\t");
		System.out.print(rsmd.getColumnName(2));
		System.out.println();
		while(rs.next())
		{
			System.out.print(rs.getString("p_id") + "\t");
			System.out.print(rs.getString("person_age") + "\t");
			System.out.println();
		}
		System.out.println("done");
	}
}
//selct command not only returning the data but also it returns meta data(e.g column information)
//extracting meta data of result set into ResultSetMetaData