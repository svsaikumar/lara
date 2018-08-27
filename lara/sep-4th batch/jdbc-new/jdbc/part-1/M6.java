//package pack1;
import java.sql.*;
import java.util.Scanner;
class  M6
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter id");
		String id=sc.next();
		System.out.println("please enter name");
		String name=sc.next();
		System.out.println("please enter age");
		String age=sc.next();
		String sql="INSERT INTO PERSON VALUES("+id+",'" +name+ "',"+age+")";//name is a varchar column it should be under single quotes
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		stmt.execute(sql);
		System.out.println("done");
	}
}

/*E:\JDBC11.30\app1\classes>java pack1.M6
please enter id
1
please enter name
dhoni
please enter age
37
done
*/