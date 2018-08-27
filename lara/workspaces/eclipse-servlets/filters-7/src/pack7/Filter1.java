package pack7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter 
{
    public Filter1()
    {
        
    }
	public void destroy()
	{
		System.out.println("Filter-1 destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		out.println("from Filter-1 begin<br>");
		chain.doFilter(request, response);
		out.println("from Filter-1 end<br>");
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println("from Filter-1.Init()");
	}
}
//in order to achieve, pre-execution of server and post execution of server or both we can go for filters
//if we want to achieve any thing before execution of our actual servlet or after servlet use filters
//filter is initiating(object creating) while server is starting, from every filter object init method is executing
//filters has auto load on startup
//if servlet is assigning to a filter, before that servlet, browser is interacting with filter
// doFilter() method is executing whenever we are making a call to Servlet
//whichever filters are assigned to servelet, all those are executing , then only servlet is executing
//we can assign any number of filters to a single servlet
//init() method is executing only one time when server is stopping
//for every request dofilter() method is calling
//filters are reusable components(they can be assigned to any number of resources(servlerts,html, jsp,.. etc)
//we can't call a filter from the browser
//we have to call a resource which is assigned with filter
//we can't develop a entire request process by using  filter(filters is a part of request)-as we can't call a filter directly'