package pack4;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet4 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
    public Servlet4() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Sekar");
		map.put("age", "22");
		map.put("weight", "58.6");
		request.setAttribute("msg", map);
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet4.jsp");
		rd.forward(request, response);
	}

}
