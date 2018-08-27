package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		out.println("First Name:" + s1 + "<br>");
		out.println("Last Name:" + s2 + "<br>");
				
		out.println("<form action='Servlet2'>");
		out.println("Age:<input type ='text' name='age'/> <br>");
		out.println("Email:<input type ='text' name='email'/> <br>");
		out.println("<input type='submit' value='submit'/> <br> ");
		out.println("</form>");
	}
}
//http is a state less protocal
//user session is not maintaining
//not tracking user session
//every user request is independent
//programatically we have to maintain a session
/*there are 4 ways to maintain a session programatically
 * 
 */




