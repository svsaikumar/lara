//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


class M35
{
	public static void main(String[] args)
	{
		String sql = "Update book1 set author = ? where id = ?";
		try(Connection con = Util.getConnection();
			PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.setString(1,"manohar");
				pstmt.setInt(2, 653);
				pstmt.executeUpdate();

				pstmt.setString(1,"murali");
				pstmt.setInt(2, 652);
				pstmt.executeUpdate();

		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//through ? we can specify only data, but any other (column name , table name..etc)
