import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
class M44
{
	public static void main(String[] args)
	{
		String sql = "{ CALL P5(?, ?, ?) }";//defining a callable stmt using sql command
		try(Connection con = Util.getConnection();
		    CallableStatement cstmt = con.prepareCall(sql))
		{
			cstmt.setInt(1, 901);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			csmt.execute();
			String title = csmt.getString()
			int price = csmt.getInt(1);
			int age = csmt.getString(1);
			System.out.println(age);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//