package pack7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Filter4 implements Filter 
{

    public Filter4()
    {
        
    }

	public void destroy() 
	{
		System.out.println("Filter-4 destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		out.println("from Filter-4 begin<br>");
		chain.doFilter(request, response);
		out.println("from Filter-4 end<br>");
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("Filter-4 Init()");
	}

}
