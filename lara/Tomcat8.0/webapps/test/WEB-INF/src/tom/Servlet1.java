package tom;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Servlet1 extends HttpServlet
{	
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		PrintWriter out = r2.getWriter();
		out.println("service from tom");
	}	
}
