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
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		
		
		ArrayList<Person> persons = (ArrayList<Person>)session.getAttribute("persons");
		int index = Integer.parseInt(request.getParameter("id"));
		Person person = persons.get(index);
		
		PrintWriter out = response.getWriter();
		
		out.println("<form action ='" + response.encodeURL("EditServlet") + "' method='post'>" );
		out.println("<input type='hidden' name='id' value='" + index + "'/>");
		out.println("First Name:<input type = 'text' name='firstName' value ='" + person.getFirstName() + "'/> <br>");
		out.println("Last Name:<input type = 'text' name='lastName' value ='" + person.getLastName() + "'/> <br>");
		out.println("Age:<input type='text' name='age'value ='" + person.getAge() + "'/> <br>");
		out.println("Email:<input type='text' name='email' value='" + person.getEmail() + "'/> <br>");
		out.println("<input type='submit' value='Save'/><br/>");
		out.println("</form>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		
		ArrayList<Person>persons = (ArrayList<Person>)session.getAttribute("persons");
		Person person = new Person();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String id = request.getParameter("id");
		Integer index = Integer.parseInt(id);
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAge(Integer.parseInt(age));
		person.setEmail(email);
		
		
		persons.set(index, person);
		//persons.add(person);
		PrintWriter out = response.getWriter();
		
		out.println(firstName + ":updated  successfully<br/>");
		out.println("<a href='" + response.encodeURL("AddServlet") + "'> Add One more?</a>");
		out.println("<a href='" + response.encodeURL("ListServlet") + "'> List All</a>");
	}

}
