//package pack1;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

class  M45
{
	public static void main(String[] args) 
	{
		String sql = "{ CALL P6(?) }";
		try(Connection con = Util.getConnection();
			CallableStatement cstmt = con.prepareCall(sql))
		{
				cstmt.setInt(1, 2001);
				cstmt.registerOutParameter(1, Types.INTEGER);
				cstmt.execute();

				int age = cstmt.getInt(1);
				System.out.println(age);
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

CREATE OR REPLACE PROCEDURE P6(ARG1 IN OUT NUMBER) AS BEGIN
SELECT AGE INTO ARG1 FROM PERSON WHERE ID = ARG1;
END;

*/
//eventhoguh there is single command inside stored procedure, it should with semi colon


//person table 
//address(person_id forein key,uni)