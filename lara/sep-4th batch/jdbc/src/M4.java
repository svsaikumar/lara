import java.sql.*;
class M4
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String s1="INSERT INTO TEST101 VALUES(7,'CHETHAN')";
		String s2="UPDATE TEST101 SET FIRST_NAME='CHINNU'WHERE ID=3";
		String s3="DELETE FROM TEST101 WHERE ID=5";
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		System.out.println("done");
	}
}
/*output:done*/
//any number of sql commands we can triggered