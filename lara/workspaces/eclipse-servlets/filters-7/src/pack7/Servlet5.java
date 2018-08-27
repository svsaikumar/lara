package pack7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet5 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public Servlet5() 
    {
        super();  
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		out.println("Servlet-5-begin");
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet6");
		rd.forward(request, response);
		out.println("Servlet-5-end");
	}
}
