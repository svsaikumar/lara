import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class M32
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(450, 'SPRING', 'MANU',600)";
		try(Connection con = Util.getConnection();
		    PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.executeUpdate();
				pstmt.executeUpdate();
				pstmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//statement object is a dynamic object
//while creating 
//