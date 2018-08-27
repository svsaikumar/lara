package pack1;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet 
{
	protected void doGet(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		String s1 = r1.getParameter("firstName");
		r1.setAttribute("sarika", "sarika");
		String s2= (String)r1.getAttribute("sarika");
		
		PrintWriter out = r2.getWriter();
		out.println(s1 + ":" + s2);
	}
	
}
