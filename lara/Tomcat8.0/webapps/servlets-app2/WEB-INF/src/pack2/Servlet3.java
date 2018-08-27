package pack2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class Servlet3 extends HttpServlet
{
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		PrintWriter out = r2.getWriter();
		String firstName = r1.getParameter("firstName");
		String lastName = r1.getParameter("lastName");
		String age  = r1.getParameter("age");
		String email = r1.getParameter("email");
		String address = r1.getParameter("address");
		String password = r1.getParameter("password");
		out.println("FirstName: " + firstName);
		out.println("LastName: " + lastName);
		out.println("Age: " + age);
		out.println("Email: " + email);
		out.println("Password: " + password);
		out.println("Address: " + address);
	}
}