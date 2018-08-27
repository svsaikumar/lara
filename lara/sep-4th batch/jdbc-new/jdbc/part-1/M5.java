//package pack1;
import java.sql.*;
class  M5
{
	public static void main(String[] args) throws Exception
	{

		if(args.length < 3)
		{
			System.out.println("pls supply 3 command line args");
			return;
		}
		String id=args[0];
		String name=args[1];
		String age=args[2];//even though age is string value is integer
		String sql="INSERT INTO PERSON VALUES("+id+",'" +name+ "',"+age+")";//id and age is integer
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
			  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		stmt.execute(sql);
		System.out.println("done");
	}
}