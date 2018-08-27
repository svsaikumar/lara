package pack4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		request.setAttribute("msg", "fromServlet-1");
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet1.jsp");
		rd.forward(request, response);
	}

}
