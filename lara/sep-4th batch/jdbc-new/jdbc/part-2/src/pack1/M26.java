//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


class M26
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(2, 'J2EE', 'RAMU', 600)";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
		{
			int i = stmt.executeUpdate(sql);
			System.out.println(i);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//ddl and dml = execute()
//ddl = execute()(recomended)-return type is boolean
//dml = executeUpdate(recomemned)-return type is int