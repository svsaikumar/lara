import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
class M42
{
	public static void main(String[] args)
	{
		String sql = "{ CALL P3(?, ?, ?, ?, ?) }";//defining a callable stmt using sql command
		try(Connection con = Util.getConnection();
		    CallableStatement cstmt = con.prepareCall(sql))
		{
			cstmt.setInt(1, 902);
			cstmt.setString(2, "html");
			cstmt.setString(3, "mohan");
			cstmt.setInt(4, 350);
			cstmt.execute();

			cstmt.setInt(1, 903);
			cstmt.setString(2, "ANDROID");
			cstmt.setString(3, "hari");
			cstmt.setInt(4, 306);
			cstmt.execute();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//