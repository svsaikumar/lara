//package pack1;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;



class  M39
{
	public static void main(String[] args) 
	{
		String sql = "{ CALL P2 }";//here p1 is name of stored procedure
		try(Connection con = Util.getConnection();
			CallableStatement cstmt = con.prepareCall(sql))
		{
				cstmt.execute(sql);//no issue regarding the type of commands in stored procedure
		}							//we can use execute() method
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//CALL is a keyword which is used to call stored procedure
//Callable statement is only for giving a call to stored procedure
//WE HAVE TO call the stored proedure with in {} braces
/*
CREATE OR REPLACE PROCEDURE P2 AS BEGIN
INSERT INTO PERSON VALUES(2004, 'ABC', 22);
INSERT INTO PERSON VALUES(2005, 'XYZ', 24);

INSERT INTO PERSON VALUES(2006, 'TEST', 25);

INSERT INTO BOOK1 VALUES(3004, 'JAVA MADE EASY', 'VIJAY', 500);
INSERT INTO BOOK1 VALUES(3005, 'J2EE MADE EASY', 'VIJAY', 600);
INSERT INTO BOOK1 VALUES(3006, 'ANGULAR MADE EASY', 'VIJAY', 300);
END;
*/