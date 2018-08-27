package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.println("service method from app-4");
	}
}
//we can deploy any type of file into web application(web.xml)-deployment descriptor
//there should be only one deployment descriptor(web.xml) for one application
//developing servlets withour package is not recommeded
//use package for every java file