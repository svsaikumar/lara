package pack4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
		ServletContext context = getServletContext();
		response.setContentType("text/html");
		context.setAttribute("r1", "someData");
		context.setAttribute("r2", 3000);
		context.setAttribute("r3", true);
		PrintWriter out = response.getWriter();
		out.println("done");
	}
}
//there is only one ServlerContext object for entire application
