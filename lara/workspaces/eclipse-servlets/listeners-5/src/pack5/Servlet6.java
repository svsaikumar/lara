package pack5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet6 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public Servlet6() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		request.setAttribute("r1", "some data");
		System.out.println("------------");
		request.setAttribute("r1", 5000);
		System.out.println("-----------");
		request.removeAttribute("r1");
		out.println("check in console");
	}
}
//in server itself internally, one request object is replacing
