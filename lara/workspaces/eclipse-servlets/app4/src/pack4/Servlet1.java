package pack4;

import java.io.IOException;


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
		request.setAttribute("r1", "someData");
		request.setAttribute("r2", 3000);
		request.setAttribute("r3", true);
		request.getRequestDispatcher("Servlet2").forward(request, response);
	}
}
//whenever rd is used ,use request object as request dispatcher
//one request only,and multiple servers