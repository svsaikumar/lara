package pack3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Servlet2 extends HttpServlet
{
	public Servlet2()
	{
		System.out.println("Servlet2()");
	}
	public void init(ServletConfig config) throws ServletException//overrided method
	{
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
/*here we will get null pointer exception as init(confi) method of generic servlet class is not calling
		-so global attribute 'config' is not initializing

we are calling one of the inherited getter method(i.e getServletContext)

*/