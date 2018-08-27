import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
class M45
{
	public static void main(String[] args)
	{
		String sql = "{ CALL P6(?) }";//defining a callable stmt using sql command
		try(Connection con = Util.getConnection();
		    CallableStatement cstmt = con.prepareCall(sql))
		{
			cstmt.setInt(1, 901);
			cstmt.registerOutParameter(1, Types.INTEGER);
			csmt.execute();
			int price = csmt.getInt(1);
			System.out.println(price);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//