package pack5;

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
		PrintWriter out = response.getWriter();
		session.setAttribute("r1", "some data");
		System.out.println("---------------");
		session.setAttribute("r1", 5000);
		System.out.println("----------------");
		session.removeAttribute("r1");
		out.println("check in console");
	}

}
