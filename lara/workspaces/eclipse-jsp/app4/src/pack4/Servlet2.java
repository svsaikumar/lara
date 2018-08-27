package pack4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		int[] x = {10,2,30,40,50};
		request.setAttribute("msg", x);
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet2.jsp");
		rd.forward(request, response);
	}

}
