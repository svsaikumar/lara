package pack3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Servlet1 extends HttpServlet
{
	public Servlet1()
	{
		System.out.println("Servlet1()");
	}
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("inti(config)");
	}
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		System.out.println("service");
		PrintWriter out = r2.getWriter();
		out.println("check in the log file");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}

}
