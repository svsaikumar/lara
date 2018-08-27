package pack2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;



public class Servlet6 extends HttpServlet
{
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException, IOException
	{
		/*
		//By using getParameter() method; return type of this method is "String"
		
		String firstName = r1.getParameter("firstName");
		String lastName  = r1.getParameter("lastName");
		String age       = r1.getParameter("age");
		String email     = r1.getParameter("email");
		String username  = r1.getParameter("username");
		String password  = r1.getParameter("password");
		String address   = r1.getParameter("address");
		String gender    = r1.getParameter("gender");
		String skills    = r1.getParameter("skill");
		String education = r1.getParameter("education");

		PrintWriter out  = r2.getWriter();
		out.println("FirstName   :" + firstName);
		out.println("LastName    :" + lastName);
		out.println("Age         :" + age);
		out.println("Email       :" + email);
		out.println("User Name   :" + username);
		out.println("Password    :" + password);
		out.println("Address     :" + address);
		out.println("Address     :" + gender);
		out.println("Skills      :" + skills);
		out.println("Education   :" + education);

		*/


	//by using getParameterValues() whose return type is String[]

/*
		String[] firstName = r1.getParameterValues("firstName");
		String[] lastName  = r1.getParameterValues("lastName");
		String[] age       = r1.getParameterValues("age");
		String[] email     = r1.getParameterValues("email");
		String[] username  = r1.getParameterValues("username");
		String[] password  = r1.getParameterValues("password");
		String[] address   = r1.getParameterValues("address");
		String[] gender    = r1.getParameterValues("gender");
		String[] skills    = r1.getParameterValues("skill");
		String[] education = r1.getParameterValues("education");

		PrintWriter out  = r2.getWriter();
		out.println("FirstName   :" + Arrays.toString(firstName));
		out.println("LastName    :" + Arrays.toString(lastName));
		out.println("Age         :" + Arrays.toString(age));
		out.println("Email       :" + Arrays.toString(email));
		out.println("User Name   :" + Arrays.toString(username));
		out.println("Password    :" + Arrays.toString(password));
		out.println("Address     :" + Arrays.toString(address));
		out.println("Address     :" + Arrays.toString(gender));
		out.println("Skills      :" + Arrays.toString(skills));
		out.println("Education   :" + Arrays.toString(education));
*/


	// By using getParameterMap()  : Map

	/*

		Map params = r1.getParameterMap();
		String[] firstName = (String[])params.get("firstName");
		String[] lastName  = (String[])params.get("lastName");
		String[] age       = (String[])params.get("age");
		String[] email     = (String[])params.get("email");
		String[] username  = (String[])params.get("username");
		String[] password  = (String[])params.get("password");
		String[] address   = (String[])params.get("address");
		String[] gender    = (String[])params.get("gender");
		String[] skills    = (String[])params.get("skill");
		String[] education = (String[])params.get("education");

		PrintWriter out  = r2.getWriter();
		out.println("FirstName   :" + Arrays.toString(firstName));
		out.println("LastName    :" + Arrays.toString(lastName));
		out.println("Age         :" + Arrays.toString(age));
		out.println("Email       :" + Arrays.toString(email));
		out.println("User Name   :" + Arrays.toString(username));
		out.println("Password    :" + Arrays.toString(password));
		out.println("Address     :" + Arrays.toString(address));
		out.println("Address     :" + Arrays.toString(gender));
		out.println("Skills      :" + Arrays.toString(skills));
		out.println("Education   :" + Arrays.toString(education));
//return type of get() method is Object type, so we are downcasting it to 'String' type


*/


	// By using getQuery() : String
		PrintWriter out  = r2.getWriter();
		String queryString = r1.getQueryString();
		String[] params = queryString.split("&");
		int index;
		String name, value;

		for(String param:params)
		{
			index = param.indexOf("=");
			name  = param.substring(0, index);
			value = param.substring(index+1,param.length());
			out.println(name + ":" + value);
		}
	}
}
//firstName=sai&lastName=k&age=10&email=sai%40gmail.com&email=sai%40gmail.com&username=saikumar&password=hello&
//address=btm&gender=m&skill=c&skill=cpp&skill=java&skill=orcl&education=be&education=mca