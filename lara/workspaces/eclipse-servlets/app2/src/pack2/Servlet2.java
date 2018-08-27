package pack2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet2() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("firstName");
		String s2 = (String) request.getAttribute("revFirstName");
		System.out.println("servlet-2  (SOP): " + s1 + "," + s2);
		out.println("servlet-2 (out): " + s1 + "," + s2);
	}
}
