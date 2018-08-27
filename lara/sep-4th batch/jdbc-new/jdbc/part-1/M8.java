//package pack1;
import java.sql.*;
import java.io.*;
class  M8
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		FileReader fin=new FileReader("data.txt");//2 murali 20;
		BufferedReader bin=new BufferedReader(fin);//3 sai 21;
		String record=bin.readLine();
		String id,name,age,sql,data[];
		while(record !=null)
		{
			data=record.split(";");
			id=data[0].trim();
			name=data[1].trim();
			age=data[2].trim();
			sql="INSERT INTO PERSON VALUES("+id+",'" +name+ "',"+age+")";
			stmt.execute(sql);
			record=bin.readLine();
		}
		System.out.println("done");
	}
}

/*data.txt is made on the classes folder(wherever java command is running)*/