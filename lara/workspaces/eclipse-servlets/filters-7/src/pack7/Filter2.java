package pack7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Filter2 implements Filter 
{

    
    public Filter2()
    {
        
    }

	public void destroy()
	{
		System.out.println("Filter-2 destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		out.println("from Filter-2 begin<br>");
		chain.doFilter(request, response);
		out.println("from Filter-2 end<br>");
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("from Filter-2.Init()");
	}

}
//in order to achieve, pre-execution of server and post execution of server or both
//if we want to achieve any thing before execution of our actual servlet or after servlet use filters
//filter is initiating(object creating) while server is starting, from every filter object init method is executing
//filters has auto load on startup
//if servlet is assigning to a filter, before that servlet, browser is interacting with filter
// doFileter() method is executing whenever we are making a call to Servlet
//whichever filters are assigned to servelet, all those are executing , then only servlet is executing
//we can assign any number of filters to a single servlet
//init() method is executing only one time when server is stopping
//for every request dofilter() method is calling
//by defalut filter is a requesttype dispatcher
//there are 4 types of dispatchers available
//1.request
//2.forward
//3.include
//4.error