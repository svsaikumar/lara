//package pack1;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


class M34
{
	public static void main(String[] args)
	{
		String sql = "INSERT INTO BOOK1 VALUES(?,?,?,?)";
		try(Connection con = Util.getConnection();
			PreparedStatement pstmt = con.prepareCall(sql))
		{
				pstmt.setInt(1,651);
				pstmt.setString(2, "JS");
				pstmt.setString(3, "Manu");
				pstmt.setInt(4,300);
				pstmt.executeUpdate();

				pstmt.setInt(1,652);
				pstmt.setString(2, "Core Java");
				pstmt.setString(3, "Vijay");
				pstmt.setInt(4,500);
				pstmt.executeUpdate();

				pstmt.setInt(1,653);
				pstmt.setString(2, "Servlets");
				pstmt.setString(3, "Kiran");
				pstmt.setInt(4,550);
				pstmt.executeUpdate();


		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//by uisng prepard we can send format of sql commandf without data
//this is possible through only prepared statement(not possible throguh statement)
//but before executing we have to set all the values to every question mark
//every question having indexes from left to right starting from 1
