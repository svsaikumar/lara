//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


class M25
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(1, 'JAVA', 'VIJAY', 500)";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
		{
			stmt.execute(sql);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
			