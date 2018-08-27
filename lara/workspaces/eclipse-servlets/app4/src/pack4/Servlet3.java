package pack4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet3 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Servlet3()
    {
        super(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		session.setAttribute("r1", "someData");
		session.setAttribute("r2", 3000);
		session.setAttribute("r3", true);
		PrintWriter out = response.getWriter();
		out.println("<a href='"  + response.encodeURL("Servlet4") + "'>call Servlet</a>");
	}
}
//whether cookies blocked or not , session management should work