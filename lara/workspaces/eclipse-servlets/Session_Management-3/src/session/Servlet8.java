package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet8 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public Servlet8()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Cookie[] cookies = request.getCookies();
		if(cookies != null)
		{
			String name, value;
			for(Cookie cookie:cookies)
			{
				name = cookie.getName();
				value = cookie.getValue();
				out.println(name + ":" + value + "</br>");
			}
		}
		else
		{
			out.println("noo cookies available");
		}
		String s3 = request.getParameter("age");
		String s4 = request.getParameter("email");
		out.println("Age :" + s3 + "<br>");
		out.println("Email :" + s4 + "<br>");	
	}

}
//http session is a interface from javax.servlet.http
//
