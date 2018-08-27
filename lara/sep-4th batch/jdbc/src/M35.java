import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class M35
{
	public static void main(String[] args)
	{
		String sql = "UPDATE BOOK1 SET AUTHOR = ? WHERE ID = ?";
		try(Connection con = Util.getConnection();
		    PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.setString(1, "manohar");
				pstmt.setInt(2, 653);
				pstmt.executeUpdate();
				
				pstmt.setString(1, "murali");
				pstmt.setInt(2, 652);
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
//? follows same order from left to right