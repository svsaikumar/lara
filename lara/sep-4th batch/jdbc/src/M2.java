import java.sql.*;
class  M2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");

		Statement stmt = con.createStatement();

		String s1 = "INSERT INTO TEST101 VALUES(1, 'SAIKUMAR')";

		stmt.execute(s1);
		stmt.close();
		con.close();
		System.out.println("Hello World!");
	}
}
