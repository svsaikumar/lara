package pack5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ServletContext context = getServletContext();
		context.setAttribute("r1", "some data");
		System.out.println("-----------");
		context.setAttribute("r1", 5000);
		System.out.println("-----------");
		context.removeAttribute("r1");
		System.out.println("-----------");
		PrintWriter out = response.getWriter();
		out.println("check in console");
	}
}
//wherever key value listeners are there, then 2 values can't be with same name(automaticallu replacing)
//
