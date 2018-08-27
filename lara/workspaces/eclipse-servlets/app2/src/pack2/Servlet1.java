package pack2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public Servlet1() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("firstName");
		String s2 = new StringBuffer(s1).reverse().toString();
		request.setAttribute("revFirstName", s2);
		System.out.println("servlet-1 begin(SOP)");
		out.println("servlet-1 begin(out)");
		
		ServletContext context = getServletContext();
		//response.sendRedirect("/app1/Servlet7");//browser only making req to Servlet2//response is goiong back to browser
		
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet2");
							//after getting req.disp we can dispatch request in two ways-one is using forward() and second is include()
		rd.forward(request, response);
		 
		//rd.include(request, response);
		System.out.println("servlet-1 end (SOP)");
		out.println("servlet-1 end(out)");
	}
}
//requestdispatcher is  a interface.inside it, it has 2 methods-forward(), include()
//there are 2 ways to get a reqdisp. type of the object
//one is by using 'request' object 
//other is by using 'servlet context' object
//why do we need req.disp- is used for dispatchinhg current request to any another servlet or to any html or to any jsp
//giving a call from servlet to another resource
//we can achieve reusability using requestDispatchers
//relative way of finding the target  = use request object
//absolute way of finding the target = use Context object


//reqdispatcher  is a server side technique or mechanism(protocal independent)
//by using reqdis we can read form data in target resource
//we can dispactch to any other resourc e of current project, we can't dispatch to other web applications resource(other project)

//servlet1 making a request to browswet that it has to call servlet2

/*
 RequestDispatcher-forward()
 ===============================
 address bar : http://localhost:7070/app2/Servlet1?firstName=hello//browswe did not know it is calling to new Servlet2
 body = servlet-2 (out): hello,olleh
 console :
 	servlet-1 begin(SOP)
	servlet-2  (SOP): hello,olleh
	servlet-1 end (SOP)
	
	

RequestDispathcer-include()
=========================
address bar : http://localhost:7070/app2/Servlet1?firstName=hello
body = servlet-1 begin(out) servlet-2 (out): hello,olleh servlet-1 end(out)
console:
	servlet-1 begin(SOP)
	servlet-2  (SOP): hello,olleh
	servlet-1 end (SOP)

 */
