import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class M34
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(?, ?, ?,?)";
		try(Connection con = Util.getConnection();
		    PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.setInt(1, 651);
				pstmt.setString(2, "JS");
				pstmt.setString(3, "Manu");
				pstmt.setInt(4, 300);
				pstmt.executeUpdate();
				pstmt.setInt(1, 652);
				pstmt.setString(2, "Core Java");
				pstmt.setString(3, "Vijay");
				pstmt.setInt(4, 500);
				pstmt.executeUpdate();
				pstmt.setInt(1, 653);
				pstmt.setString(2, "Servlets");
				pstmt.setString(3, "kiran");
				pstmt.setInt(4, 550);
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