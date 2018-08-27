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
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    public DeleteServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		
		ArrayList<Person>persons = (ArrayList<Person>)session.getAttribute("persons");
		Person person = new Person();
		String id = request.getParameter("id");
		Integer index = Integer.parseInt(id);
		
		person = persons.get(index);
		persons.remove(person);
		out.println("record no." + index +  " removed successfully" + "<br>");
		out.println("<a href='" + response.encodeURL("AddServlet") + "'> Add One more?</a>");
		out.println("<a href='" + response.encodeURL("ListServlet") + "'> List All</a>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
