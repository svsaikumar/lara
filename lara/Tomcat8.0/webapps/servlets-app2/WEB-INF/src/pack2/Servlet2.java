package pack2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class Servlet2 extends HttpServlet
{
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		PrintWriter out = r2.getWriter();
		String s1 = r1.getParameter("firstName");
		String s2 = r1.getParameter("lastName");
		out.println("FirstName: " + s1);
		out.println("LastName: " + s2);
	}
}
/*http://localhost:7070/servlets-app2/s2
	FirstName: null
	LastName: null

//http://localhost:7070/servlets-app2/s2?firstName=hello
	FirstName: hello
	LastName: null

//http://localhost:7070/servlets-app2/s2?firstName=hello&lastName=world
	FirstName: hello
	LastName: world
*/

//we can read client information(form data, querystring..etc) and browser data by using request object
//from server we can read browser meta data

//we can send any response back to the browser by using response object