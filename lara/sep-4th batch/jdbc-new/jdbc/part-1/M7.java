//package pack1;
import java.sql.*;
import java.util.Scanner;
class  M7
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		String id,name,age,sql;
		do
		{
			 System.out.println("please enter id");
			 id=sc.next();
			 System.out.println("please enter name");
			 name=sc.next();
			 System.out.println("please enter age");
			 age=sc.next();
			 sql="INSERT INTO PERSON VALUES("+id+",'" +name+ "',"+age+")";
			 stmt.execute(sql);
			 System.out.println("do you want to insert one more(yes/no)?");
		}
		while("yes".equalsIgnoreCase(sc.next()));
		System.out.println("done");
	}
}
/*minimum one record is added.do-while*/
/*E:\JDBC11.30\app1\classes>java pack1.M7
please enter id
7
please enter name
dhoni
please enter age
37
do you want to insert one more(yes/no)?
yes
please enter id
2
please enter name
sakshi
please enter age
26
do you want to insert one more(yes/no)?
no
done*/
