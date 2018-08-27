package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class Servlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet7() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String s1 = request.getParameter("firstName");
		String s2 = request.getParameter("lastName");
		out.println("First Name:" + s1 + "<br>");
		out.println("Last Name:" + s2 + "<br>");
		
		Cookie c1 = new Cookie("firstName", s1);//defining 2 cookies.firstName is 
		Cookie c2 = new Cookie("lastName", s2);
		
		c1.setMaxAge(60);//c1 cookie is available for max.60sec
		
		response.addCookie(c1);//both cookies are storing in response object
		response.addCookie(c2);//browser receiving 2 cookies, storing in browser memory
		
		out.println("<form action='Servlet8'>");
		out.println("Age:<input type ='text' name='age'/> <br>");
		out.println("Email:<input type ='text' name='email'/> <br>");
		out.println("<input type='submit' value='submit'/> <br> ");
		out.println("</form>");
	}
}
//browser is calling servlet8 along with cookies
//cookie object is creating in server,same cookie is sending to browser
//cookie is small piece of information creating by server and sending to the server
//browser is maintaining the cookie
//when response contains cookies, browser stores the cookies, and sending copies of cookies to the server for subsequent request from the same browser
//cookies are creating in the server, sent to the browser, storing in browser memory,
//default life of a cookie is browser life
