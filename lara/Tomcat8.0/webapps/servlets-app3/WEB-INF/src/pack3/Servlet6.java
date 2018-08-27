package pack3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Servlet6 extends HttpServlet
{
	public Servlet6()
	{
		System.out.println("Servlet3()");
	}
	public void init()
	{
		System.out.println("init()");
	}
	public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		System.out.println("doPost");
		PrintWriter out = r2.getWriter();
		ServletContext c1 = getServletContext();//getServletContext() is a inherited method
		out.println("check in the log file");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}
}
//here 'HttpServlet' class service method which is inherited to current class is executing
