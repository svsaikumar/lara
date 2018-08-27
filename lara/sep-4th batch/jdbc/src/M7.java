import java.sql.*;
import java.io.*;
class M7
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");
		Statement stmt=con.createStatement();
		FileReader fin=new FileReader("data.txt");
		BufferedReader bin=new BufferedReader(fin);
		String line=null;
		String id,name,sql;
		while((line=bin.readLine())!=null)
		{
			id=line.substring(0,line.indexOf(";"));
			name=line.substring(line.indexOf(";")+1,line.length());
			sql="INSERT INTO TEST101 VALUES("+id+",'"+name+"')";	
		stmt.execute(sql);
		}
		System.out.println("done");
	}
}
/*output:done*/
//any number of sql commands we can triggered