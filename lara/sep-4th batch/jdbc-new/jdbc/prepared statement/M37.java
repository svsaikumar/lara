//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


class M37
{
	public static void main(String[] args)
	{
		String sql = "create table book2(sno number)";//sql command is concrete
		try(Connection con = Util.getConnection();
			PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.execute(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//we can supply concrete sql command also
//while creating a table we are not supplying any data so we should not use ?
//any command can be triggered through prepared statement
