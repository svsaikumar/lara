package pack1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;



public class Servlet5 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public Servlet5()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		StringBuffer sql = new StringBuffer();
		sql.append("insert into sample_tab values(");
		sql.append("'" + firstName + "',");
		sql.append("'" + lastName  + "')");
				
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "Oracle123";
		System.out.println(sql);
		try
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		int insertStatus = 0;
		try(
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement())
		{
			insertStatus = stmt.executeUpdate(sql.toString());
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		if(insertStatus == 1)
		{
			out.println("insertion is success");
		}
		else
		{
			out.println("some db error");
		}
	}
}
//for entire applcation there is  only one servlet context object
//to get that object call 'getServletContext()" inherited method