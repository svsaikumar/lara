package pack5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet5 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    public Servlet5()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		Person p1 = new Person();
		session.setAttribute("r1", p1);//value bounding into sessionObject
		System.out.println("-------------");
		session.removeAttribute("r1");//value un-bounding from the session object
		System.out.println("--------------");
		PrintWriter out = response.getWriter();
		out.println("check in console");
	}
}
//whenever bound type(person object) of object is storing into session object, valueBound method() is executing
//while running this program, all the listners are removed from web.xml(so listeners are not executing)