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
 * Servlet Filter implementation class Filter2
 */
public class Filter2 implements Filter {

    
    public Filter2() {
        
    }

	public void destroy()
	{
		System.out.println("new filter-2 destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out = response.getWriter();
		System.out.println("filter-2 begin new");
		chain.doFilter(request, response);
		System.out.println("filter-2 end new");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("new filter-2 init");
	}

}
