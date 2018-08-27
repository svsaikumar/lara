import java.io.*;
import java.util.*;
public class Servlet8 extends HttpServlet  
{
	public void service(HttpServletRequest r1,HttpServletResponse r2)
		throws ServletException,IOException
	{
		PrintWriter out=r2.getWriter();
		ServletContext context=getServletContext();
		Enumeration names=context.getInitParameterNames();
		String name,value;
		while(names.hasMoreElements())
		{
			name=(String)names.nextElement();
			value=context.getInitParameter(name);
			out.println(name+":"+value);
		}
	}
}
/*
iterare the names getting the values one by one,after getting a name get it corresponding value.
use servlet context object application of the 
2. constants to servlet object
3.constants for entair application