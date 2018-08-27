//package pack1;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;



class  M41
{
	public static void main(String[] args) 
	{
		String sql = "{ CALL P3(?, ? , ?, ?) }";//here p3 is name of stored procedure
		try(Connection con = Util.getConnection();
			CallableStatement cstmt = con.prepareCall(sql))
		{
				cstmt.setInt(1, 902);
				cstmt.setString(2, "html");
				cstmt.setString(3, "mohan");
				cstmt.setInt(4, 3500);
				cstmt.execute();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//CALL is a keyword which is used to call stored procedure
//Callable statement is only for giving a call to stored procedure
//WE HAVE TO call the proedure with in {} braces
/*
CREATE OR REPLACE PROCEDURE P3(ARG1 NUMBER,
                              ARG2 VARCHAR,
                              ARG3 VARCHAR,
                              
                              ARG4 NUMBER) AS BEGIN


INSERT INTO BOOK1 VALUES(ARG1, ARG2, ARG3, ARG4);

END;
*/