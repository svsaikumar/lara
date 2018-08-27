package pack8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Servlet1() 
    {
        super(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//response.setContentType("text/html");
		response.setContentType("text/plain");
		//response.setContentType("application/msword");
		//response.setContentType("application/vnd.ms-excel");
		PrintWriter out = response.getWriter();
		Enumeration<String> names = request.getHeaderNames();
		String name, value;
		while(names.hasMoreElements())
		{
			name = names.nextElement();
			value = request.getHeader(name);
			out.println(name + ":" + value + "<br>");
		}
	}	
}
//browser information, browser properties
//reading all the names of request header into Enumeration
//reading every name into enumeration
//response headers=reading some extra data about the original browser
