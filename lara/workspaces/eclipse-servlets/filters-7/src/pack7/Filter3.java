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
 * Servlet Filter implementation class Filter3
 */
public class Filter3 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter3()
    {
        
    }
	public void destroy()
	{
		System.out.println("Filter-3 destroy()");
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		out.println("from Filter-3 begin");
		chain.doFilter(request, response);
		out.println("from Filter-3 end");
	}	
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("from Filter-3.Init()");
		
	}

}
