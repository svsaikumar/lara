import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
class M43
{
	public static void main(String[] args)
	{
		String sql = "{ CALL P4(?, ?) }";//defining a callable stmt using sql command
		try(Connection con = Util.getConnection();
		    CallableStatement cstmt = con.prepareCall(sql))
		{
			cstmt.setInt(1, 2);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			csmt.execute();
			
			String s1 = csmt.getString(2);
			System.out.println(s1);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//