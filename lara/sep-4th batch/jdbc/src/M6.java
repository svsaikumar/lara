import java.sql.*;
import java.util.*;
class M6
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		String s1=sc.next();
		System.out.println("enter name");
		String s2=sc.next();
		String s3="INSERT INTO TEST101 VALUES("+s1+",'"+s2+"')";	
		stmt.execute(s3);
		System.out.println("done");
	}
}
