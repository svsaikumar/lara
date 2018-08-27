package pack1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;


import javax.servlet.*;
import javax.servlet.http.*;



import javax.servlet.ServletException;
public class Servlet1 extends HttpServlet 
{
	public void doGet(HttpServletRequest r1 , HttpServletResponse r2)throws IOException, ServletException
	{
		String s1 = r1.getParameter("saru");
		PrintWriter out = r2.getWriter();
		//PrintWriter.r2.getWriter().println(s1);
		out.println(s1);

	}
}
//A.test();
//println();