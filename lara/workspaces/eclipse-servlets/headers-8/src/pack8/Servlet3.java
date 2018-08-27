package pack8;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Servlet3() 
    {
        super(); 
    }
    int count;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.println(count ++);
		response.setIntHeader("refresh", 10);//page is refreshing for every 10 sec
	}	
}