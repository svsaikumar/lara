package pack5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(30);//this is local to session object(30 sec)
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<a href='" + response.encodeURL("Servlet3") + "'>log out</a>");
	}
}
//session object is creating automatically
//session object is not destroyed automatically
//session object is available for upto 30min(by default)
//at the time of expiring the session object, sessionDestroyed() is executed

//independeltly to one session use setMaxInactiveInterval for a particlar sessin object