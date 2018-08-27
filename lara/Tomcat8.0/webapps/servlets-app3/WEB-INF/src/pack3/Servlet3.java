package pack3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Servlet3 extends HttpServlet
{
	public Servlet3()
	{
		System.out.println("Servlet3()");
	}
	public void init(ServletConfig config) throws ServletException//overrided method
	{
		super.init(config);
		System.out.println("init(config)");
	}
	public void init() //this method will not execute
	{
		System.out.println("inti()");
	}
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		System.out.println("service");
		PrintWriter out = r2.getWriter();
		ServletContext c1 = getServletContext();//getServletContext() is a inherited method
		out.println("check in the log file");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}
}
