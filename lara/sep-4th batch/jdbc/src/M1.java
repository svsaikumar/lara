import java.sql.*;
class  M1
{
	public static void main(String[] args) throws Exception
	{
		//1.registering a driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2.establishing a db connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Oracle123");


		//3.creating statement to send sql command
		Statement stmt = con.createStatement();


		//4.composing sql command
		String sql = "CREATE TABLE TEST101(SNO NUMBER)";

		//5.sending sql statement
		stmt.execute(sql);

		//6.closing
		stmt.close();
		con.close();
		System.out.println("done");
	}
}
