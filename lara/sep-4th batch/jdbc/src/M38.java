import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
class M38
{
	public static void main(String[] args)
	{
		String sql = "{ CALL p1 }";//defining a callable stmt using sql command
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
//callable statment is used only for giving a call to stored procedure
//Syntax = {CALL(space) name of the stored procedure}
//inside stored procedure we can store of any number of any typee of sql commands