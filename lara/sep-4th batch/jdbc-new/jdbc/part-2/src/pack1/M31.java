//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


class M31
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(350, 'SPRING', 'MANU', 600)";
		try(Connection con = Util.getConnection();
			PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//statement object is  dynamic object
//after creatig stmt object we can send any type of commands and any type of command(so stmt object is dynamic object)
//whenever command is samae use preparedstatement
//prapard sttement is derived from Statement
//while creating prapared stmt at that time itself we have to supply sql command
//after creating prepated stmt we can't change the sql command
//it is fixed only for one sql command