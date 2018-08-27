package pack1;
import java.sql.*;
class  M2
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String sql="INSERT INTO TEST1011 VALUES(1000)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
//we can run any number of times since we are just inserting row 