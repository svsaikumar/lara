package pack6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.security.x509.IssuerAlternativeNameExtension;


public class SearchServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

    public SearchServlet()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		out.println("<form action='"+response.encodeURL("SearchServlet")+"' method='post'>");
		out.println("FirstName:<input type='text' name='searchText'/>");
		out.println("<input type='submit' value='Search'/></br>");
		out.println("</form>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String searchText = request.getParameter("searchText");
		HttpSession session=request.getSession(false);
		
		ArrayList<Person> persons=(ArrayList<Person>)session.getAttribute("persons");
		
		PrintWriter out=response.getWriter();
		out.println("<table border='1'>");
		out.println("<tr><th>SNO</th><th>First Name</th>");
		out.println("<th>Last Name</th><th>Age</th><th>Email</th>");
		out.println("<th>Edit</th><th>Delete</th></tr>");
	
		int sno=1,recordId=0;
	
		for(Person person:persons)
		{
			if(isAvailable(person,searchText))
			{
				out.println("<tr>");
				out.println("<td>"+(sno++)+"</td>");
				out.println("<td>"+(person.getFirstName())+"</td>");
				out.println("<td>"+(person.getLastName())+"</td>");
				out.println("<td>"+(person.getAge())+"</td>");
				out.println("<td>"+(person.getEmail())+"</td>");
				out.println("<td><a href='"+ response.encodeURL("EditServlet?id='"+ recordId)+"'>Edit</a></td>");
				out.println("<td><a href='"+ response.encodeURL("DeleteServlet?id='"+ recordId)+"'>Delete</a></td>");
				out.println("</tr>");
			}
			else
			{
				
				out.println("no records available");
				break;
			}
			recordId++;
		}
		out.println("</table>");
		out.println("<a href='"+response.encodeURL("AddServlet")+"'>Add One more?</a>");
	
		}
		private boolean isAvailable(Person person,String searchText)
		{
			boolean flag=false;
			if(person.getFirstName().equals(searchText)||person.getLastName().equals(searchText)||
			   person.getAge().toString().equals(searchText)||person.getEmail().equals(searchText))
			{
				flag = true;
			}
			
			return flag;
		}
}


