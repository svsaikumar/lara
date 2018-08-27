package req;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class  Servlet14 extends HttpServlet
{
	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		String s1 = r1.getParameter("firstName");
		String s2 = new StringBuffer(s1).reverse().toString();
		r1.setAttribute("revFirstName", s2);
		PrintWriter out = r2.getWriter();
		out.println("Servlet-14 begin through out");
		System.out.println("Servlet-14 begin through sop");

		//r2.sendRedirect("s11");
		r2.sendRedirect("/servlets-app2/test6.html");

		out.println("Servlet-14 end through out");
		System.out.println("Servlet-14 end through sop");
	}
}
//while executing response.sendRedirect(), it not making a call to 's11'
//becaue of new request, browser is making a call to target
//for sendRedirect() also we have to use forward slash '/' as target is calling from browser

//incase of sendRedirect() , we are unable to read data in target resurce
//because fo 2 request objects, first request object content is not available in second request object

//by using this sendRedirect() we can call a resource of another application also, but it should be in same server