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
	//public void init(ServletConfig config) throws ServletException//overrided method
	{
		
	}
	public void init() //this method will not execute
	{
		System.out.println("inti()");
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
//when server is starting no method is xexcuting
//that means servlet object is not creating as soon as when we start the server
//when server is starterd no object is creating
//server will create an object for servlet with no-arg constructer
//for every servlet class, there should be one no-arg constructor, other wise we will get error(initialization errror)
//no-arg constructer is mandatory for object creation
//after creation of object, imemdiately init() method will be called
//out of 2 init() methods avazilable in Httpservlet class, we are overrifing only one init() method with one argument
//another inti() method is no-arg method(which is not overriding)
//after executing init() methdod, it is calling service() method
//new object is not creating from second request
//init() method with no-arg is not executing in entire life cycle


//init() and constructor are calling when we make a first request, 
//service() method is calling for every request(including the first request)
//service() meth is calling from same object
//destroy() method is calling when we stop the server

//by using <load-on-startup> we can make server to create servlet object when server is started