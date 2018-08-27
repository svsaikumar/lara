package pack3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class  Servlet10 extends HttpServlet
{
	
	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		String s1 = r1.getParameter("firstName");
		String s2 = new StringBuffer(s1).reverse().toString();
		r1.setAttribute("revFirstName", s2);
		PrintWriter out = r2.getWriter();
		out.println("Servlet-10 begin through out");
		System.out.println("Servlet-10 begin through sop");

		RequestDispatcher rd =  r1.getRequestDispatcher("s11");//we can use url-pattern, html filename, jsp file name
		rd.forward(r1, r2);

		out.println("Servlet-10 end through out");
		System.out.println("Servlet-10 end through sop");
	}
}

