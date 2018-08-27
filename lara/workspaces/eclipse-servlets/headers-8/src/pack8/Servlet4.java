package pack8;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public Servlet4() 
    {
        super(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setHeader("content-disposition", "attachement;filename=something.txt");
		out.println("done");
	}	
}

