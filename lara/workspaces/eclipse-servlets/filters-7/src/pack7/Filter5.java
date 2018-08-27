package pack7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Filter5
 */
public class Filter5 implements Filter 
{

   
    public Filter5() 
    {
        // TODO Auto-generated constructor stub
    }
	public void destroy() 
	{
		System.out.println("Filter-5 destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		
		PrintWriter out = response.getWriter();
		out.println("from Filter-5 begin<br>");
		chain.doFilter(request, response);
		out.println("from Filter-5 end<br>");
	}
	public void init(FilterConfig fConfig) throws ServletException
	{
		System.out.println("Filter-5 Init()");
	}

}
