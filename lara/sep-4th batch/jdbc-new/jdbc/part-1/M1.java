


//package pack1;
import java.sql.*;
class M1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");//registering a driver
		Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE TEST1011(SNO NUMBER)";
		stmt.execute(sql);

		System.out.println("done");
	}
}

/*E:\JDBC11.30\app1\src>javac -d ../classes pack1/M1.java

E:\JDBC11.30\app1\src>cd ../classes

E:\JDBC11.30\app1\classes>java pack1/M1
done*/