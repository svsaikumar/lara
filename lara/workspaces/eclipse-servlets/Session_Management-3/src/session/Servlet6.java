package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet6 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	
   
    public Servlet6() 
    {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		out.println("First Name:" + s1 + "<br>");
		out.println("Last Name:" + s2 + "<br>");
		
		String s3 = request.getParameter("age");
		String s4 = request.getParameter("email");
		out.println("Age :" + s3 + "<br>");
		out.println("Email :" + s4 + "<br>");
	}

}
