package pack4;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet3() 
    {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("abc");
		list.add("xyz");
		list.add(true);
		request.setAttribute("msg", list);
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet3.jsp");
		rd.forward(request, response);
		
	}

	
}
