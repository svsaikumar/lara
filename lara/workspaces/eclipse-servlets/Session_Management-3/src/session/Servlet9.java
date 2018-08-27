package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet9 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Servlet9()
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
		
		
		HttpSession session = request.getSession();
		session.setAttribute("firstName", s1);
		session.setAttribute("lastName", s2);
		
		String id = session.getId();
		out.println("session id from servlet9:" + id);
		
		//String p1 = response.encodeURL("Servlet10");//p1 is return value of the encode url
		
		out.println("<form action='Servlet10;jsessionid=" + id + "'>");//explicitly we are sending the session id through url(extra path, so we need ; as a separator)
		//out.println("<form action='" + p1 + "'>");
		//out.println("<form action='" + response.encodeURL("Servlet10") + "'>");
		out.println("Age:<input type ='text' name='age'/> <br>");
		out.println("Email:<input type ='text' name='email'/> <br>");
		out.println("<input type='submit' value='submit'/> <br> ");
		out.println("</form>");
	}
}
//only one session object is created for one user(for one browser)
//session object is browser wise
//if cookies are disabled , browser is unable to maintain the session object
//session object is not maintaining by the browser, it is maintained by server only
//cookie is also created for session object
//every browser has a unique session id
//session object id is maintained in the browser memory
//Http session internally using cookie technique
