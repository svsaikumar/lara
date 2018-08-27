//package pack1;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;



class  M44
{
	public static void main(String[] args) 
	{
		String sql = "{ CALL P5(?, ?, ?) }";
		try(Connection con = Util.getConnection();
			CallableStatement cstmt = con.prepareCall(sql))
		{
				cstmt.setInt(1, 901);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.registerOutParameter(3, Types.VARCHAR);
				cstmt.execute();
				String title = cstmt.getString(2);
				String author = cstmt.getString(3);
				System.out.println(title + "," + author);
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
CREATE OR REPLACE PROCEDURE P5(ARG1 IN NUMBER,
                              ARG2 OUT VARCHAR,
                              ARG3 OUT VARCHAR) AS BEGIN
                            
                              
SELECT TITLE INTO ARG2 FROM BOOK1 WHERE ID = ARG1;
SELECT AUTHOR INTO ARG3 FROM BOOK1 WHERE ID = ARG1;
END;


*/
