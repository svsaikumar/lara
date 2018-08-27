package req;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Servlet11 extends HttpServlet
{
	public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		String s1 = r1.getParameter("firstName");
		String s2 = (String)r1.getAttribute("revFirstName");
		PrintWriter out = r2.getWriter();
		out.println("from Servlt-11 through out:" + s1 + ":" + s2);
		System.out.println("from Servlt-11 through sop:" + s1 + ":" + s2);
	}
}

