import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
class M40
{
	public static void main(String[] args)
	{
		String sql = "{ CALL P3(901, 'HADOOP', 'murali', 3000) }";//defining a callable stmt using sql command
		try(Connection con = Util.getConnection();
		    CallableStatement cstmt = con.prepareCall(sql))
		{
			cstmt.execute(sql);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//