package req;

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

		//RequestDispatcher rd =  r1.getRequestDispatcher("s11");//we can use url-pattern, html filename, jsp file name
		//rd.forward(r1, r2);
		
		//rd.include(r1, r2);

		r2.sendRedirect("/servlets-app2/test6.html");
		out.println("Servlet-10 end through out");
		System.out.println("Servlet-10 end through sop");
	}
}
//by using request object we are using requestDispatchers
//if we are using request object it is relative approach(within the current servlet)

/*
1.req.disp. is completely a servlet side technology, browser is not aware of this.
2.same request object is going to target resource(first arg of forward and include methods)
	we can read form data of first servlet in target resource(because of same request object)

3.by using req.disp., we can dispatch the request to any other resource of same project


by using req.disp, we can can't call a resource of another project(another application)
it is limited to only current web application
*/
