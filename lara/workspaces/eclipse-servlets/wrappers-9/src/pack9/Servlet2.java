package pack9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");
		response.setContentType("application/msword");
		PrintWriter out = response.getWriter();
		out.println("parameter-1:" + s1 + "<br>");
		out.println("parameter-2:" + s2 + "<br>");
	}
}
