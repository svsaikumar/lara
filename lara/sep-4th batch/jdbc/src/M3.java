import java.sql.*;
class M3
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String s1="INSERT INTO TEST101 VALUES(2,'LAXMMY KALPHANA')";
		String s2="INSERT INTO TEST101 VALUES(3,'NIRMALA')";
		String s3="INSERT INTO TEST101 VALUES(4,'MANI')";
		String s4="INSERT INTO TEST101 VALUES(5,'CHETHAN')";
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		System.out.println("done");
	}
}
/*output:done*/
//any number of sql commands we can triggered