package pack6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public AddServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(false);//if session obj is there , it returns that session object, else it returns null
		response.setContentType("text/html");
		if(session == null)
		{
			session = request.getSession(true);//if session is already there, it returns that obj reference, else it will create new object and it return that ref
			ArrayList<Person> persons = new ArrayList<>();
			session.setAttribute("persons", persons);
		}
		PrintWriter out = response.getWriter();
		out.println("<form action ='" + response.encodeURL("AddServlet") + "' method='post'>" );
		out.println("First Name:<input type = 'text' name='firstName'/> <br>");
		out.println("Last Name:<input type = 'text' name='lastName'/> <br>");
		out.println("Age:<input type='text' name='age'/> <br>");
		out.println("Email:<input type='text' name='email'/> <br>");
		out.println("<input type='submit' value='submit'");
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		if(session == null)
		{
			session = request.getSession(true);
			ArrayList<Person> persons = new ArrayList<>();
			session.setAttribute("persons", persons);
		}
		ArrayList<Person>persons = (ArrayList<Person>)session.getAttribute("persons");
		Person person = new Person();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAge(Integer.parseInt(age));
		person.setEmail(email);
		
		persons.add(person);
		PrintWriter out = response.getWriter();
		
		out.println(firstName + ":saved successfully<br/>");
		out.println("<a href='" + response.encodeURL("AddServlet") + "'> Add One more?</a>");
		out.println("<a href='" + response.encodeURL("ListServlet") + "'> List All</a>");
		out.println("<a href='" + response.encodeURL("SearchServlet") + "'> Search</a>");
	}

}
//mainly doget() is for getting a form
