package pack2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class Servlet1 extends HttpServlet
{
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		PrintWriter out = r2.getWriter();
		out.println("Hello World! through out");
		System.out.println("Hello World! through sop");
	}
}
//every servlet should be a public class
//every java class should be a subclass to HttpServlet
//in core java, default executable method is main which is static method
//default method is service method which is not-static(object needed for execution)
//so servlet class should not be abstract(as we need to create object to call non-staic method service())
//from servlet if we want to send any output to browser, use PrintStream but not SOP
//SOP message is printning in the log files