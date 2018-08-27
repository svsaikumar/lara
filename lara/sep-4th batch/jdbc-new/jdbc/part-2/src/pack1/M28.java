//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


class M28
{
	public static void main(String[] args)
	{
		String sql1 = "INSERT INTO BOOK1 VALUES(3, 'SPRING', 'MANU', 600)";
		String sql2 = "INSERT INTO BOOK1 VALUES(4, 'HIBERNATE', 'KUMAR', 600)";
		String sql3 = "INSERT INTO BOOK1 VALUES(5, HADOOP', 'SWETHA', 600)";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
			
		{
				stmt.executeUpdate(sql1);
				System.out.println("sql1 is triggered successfully");
				stmt.executeUpdate(sql2);
				System.out.println("sql2 is triggered successfully");
				stmt.executeUpdate(sql3);
				System.out.println("sql3 is triggered successfully");
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//here all the sql commands are independent