package req;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class  Servlet12 extends HttpServlet
{
	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		String s1 = r1.getParameter("firstName");
		String s2 = new StringBuffer(s1).reverse().toString();
		r1.setAttribute("revFirstName", s2);
		PrintWriter out = r2.getWriter();
		out.println("Servlet-12 begin through out");
		System.out.println("Servlet-12 begin through sop");
		ServletContext c1 = getServletContext();
		RequestDispatcher rd =  c1.getRequestDispatcher("/s13");
		
		rd.forward(r1, r2);
		//rd.include(r1, r2);

		out.println("Servlet-12 end through out");
		System.out.println("Servlet-12 end through sop");
	}
}
//by using ServletContext object we are using requestDispatchers
//if we are using ServletLConterxt, it not relative to current servlet, it is relative to current application
//so we have to use '/'
//here it is directly not calling the requested resource
//first control ,it is coming to root of the project, then it is calling
