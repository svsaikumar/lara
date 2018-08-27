package pack7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public Servlet3() 
    {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		System.out.println("calling servlet-4");
		//RequestDispatcher rd = request.getRequestDispatcher("/Servlet4");
		//rd.forward(request, response);
	}
}
