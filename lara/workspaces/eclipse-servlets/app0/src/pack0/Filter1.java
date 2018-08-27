package pack0;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Filter1
 */
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter1() {
        // TODO Auto-generated constructor stub
    }
    
   
	public void destroy() 
	{
		 System.out.println("filter-1 destroyed");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		out.println("filter-1 begin");
		chain.doFilter(request, response);
		out.println("filter-1 end");
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("filter-1 initialized");
	}

}
