package com.lara;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet1 extends HttpServlet 
{
	public void service(HttpServletRequest r1,
						HttpServletResponse r2)
		throws ServletException, IOException
	{
		PrintWriter out = r2.getWriter();
		Person p1 = (Person) r1.getAttribute("obj");
		out.println(p1.getHello() + "<br>");
		out.println("from servlet<br>");
	}
}
