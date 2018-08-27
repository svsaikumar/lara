package pack4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet6 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
  
    public Servlet6()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		response.setContentType("text/html");
		String s1  = (String)  context.getAttribute("r1");
		Integer s2 = (Integer) context.getAttribute("r2");
		Boolean s3 = (Boolean) context.getAttribute("r3");
		PrintWriter out = response.getWriter();
		out.println("r1 value:" + s1);
		out.println("r2 value:" + s2);
		out.println("r3 value:" + s3);
	}
}
//now we can call through multiple browsers(as we are using ServletContext)
//ServletContext object is for one entire application(any browser)
//sharing data between different user requests


//same user,same data, different request use HttpSession Object
//different users, same data, use ServletContext Object(at the time of starting application ServletContext is creating)
//different users, 
//there are 3 containers
//user specific data= httpsession object
//current = request object(for one user)= scope of the data for current request
//application = ServletContext
//listeners is only for containers


//There are 2 types of listeners available
//1.life cycle listeners
//2.attribute management listeners
