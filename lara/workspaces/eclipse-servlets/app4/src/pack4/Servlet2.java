package pack4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public Servlet2() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1 = (String) request.getAttribute("r1");
		Integer s2 = (Integer) request.getAttribute("r2");
		Boolean s3 = (Boolean) request.getAttribute("r3");
		PrintWriter out = response.getWriter();
		out.println("r1 value:" + s1);
		out.println("r2 value:" + s2);
		out.println("r3 value:" + s3);
	}
}
//use http session to share same data between multiple requests for same user