//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


class M32
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(450, 'SPRING', 'MANU', 600)";
		try(Connection con = Util.getConnection();
			PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.executeUpdate();
				pstmt.executeUpdate();
				pstmt.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//try block content changing , sql command also changing
//we can trigger same command any number of times
//prepared statmt compiles only one time
//but in canse of statement every commadn is compiling and executing