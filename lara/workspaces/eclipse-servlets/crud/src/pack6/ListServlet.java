package pack6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ListServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
     
    public ListServlet() 
    {
        super();
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		ArrayList<Person>persons = (ArrayList<Person>)session.getAttribute("persons");
		
		PrintWriter out = response.getWriter();
		out.println("<table border='1'>");
		out.println("<tr><th>SNO</th><th>First Name</th>");
		out.println("<th>Last Name</th><th>Age</th><th>Email</th>");
		out.println("<th>Edit</th><th>Delete</th></tr>");
		int sno = 1;
		for(Person person : persons)
		{
			out.println("<tr>");
			out.println("<td>" + (sno ++) + "</td>");
			out.println("<td>" + (person.getFirstName()) + "</td>");
			out.println("<td>" + (person.getLastName()) + "</td>");
			out.println("<td>" + (person.getAge()) + "</td>");
			out.println("<td>" + (person.getEmail()) + "</td>");
			out.println("<td><a href='" + response.encodeURL("EditServlet?id=" + (sno-2)) + "'>Edit</a></td>");
			out.println("<td><a href='" + response.encodeURL("DeleteServlet?id=" + (sno-2)) + "'>Delete</a></td>");
			out.println("</tr>");
		}		
		out.println("</table>");
		out.println("<a href ='" + response.encodeURL("AddServlet") + "'>Add One More? </a>");
		out.println("<a href ='" + response.encodeURL("SearchServlet") + "'>serrche? </a>");
	}

}
