//package pack1;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;



class  M43
{
	public static void main(String[] args) 
	{
		String sql = "{ CALL P4(?, ?) }";//here p4 is name of stored procedure
		try(Connection con = Util.getConnection();
			CallableStatement cstmt = con.prepareCall(sql))
		{
				cstmt.setInt(1, 2);//2 is IN value
				cstmt.registerOutParameter(2, Types.VARCHAR);//OUT type. registering data type here
				cstmt.execute();
				String s1 = cstmt.getString(2);
				System.out.println(s1);
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
CREATE OR REPLACE PROCEDURE P4(ARG1 NUMBER,
                              ARG2 OUT VARCHAR) AS BEGIN
                       
SELECT NAME INTO ARG2 FROM PERSON WHERE ID = ARG1;
END;
*/
