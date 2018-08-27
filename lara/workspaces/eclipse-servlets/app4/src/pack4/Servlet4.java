package pack4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet4 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public Servlet4() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		String s1 = (String) session.getAttribute("r1");
		Integer s2 = (Integer) session.getAttribute("r2");
		Boolean s3 = (Boolean) session.getAttribute("r3");
		PrintWriter out = response.getWriter();
		out.println("r1 value:" + s1);
		out.println("r2 value:" + s2);
		out.println("r3 value:" + s3);
	}
}
