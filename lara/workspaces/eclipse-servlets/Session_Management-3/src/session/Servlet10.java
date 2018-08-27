package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet10 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
     
    public Servlet10()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		String s1 = (String) session.getAttribute("firstName");
		String s2 = (String) session.getAttribute("lastName");
		
		out.println("First Name:" + s1 + "<br>");
		out.println("Last Name:" + s2 + "<br>");
		
		String id = session.getId();
		System.out.println("session id from servlet10:" + id);
		
		String s3 = request.getParameter("age");
		String s4 = request.getParameter("email");
		out.println("Age :" + s3 + "<br>");
		out.println("Email :" + s4 + "<br>");	
	}
}
//if cookies are disabled , browser is unable to maintain the session object
//session object is not maintaining by the browser, it is maintained by server only





