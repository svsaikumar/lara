package pack9;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Filter1 implements Filter
{

    
    public Filter1()
    {
       
    }
	public void destroy()
	{
		
	}
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException 
	{
		HttpServletRequest hReq = (HttpServletRequest) arg0;
		HttpServletResponse hRes = (HttpServletResponse) arg1;
		RequestWrapper wReq = new RequestWrapper(hReq);
		ResponseWrapper wRes = new ResponseWrapper(hRes);
		arg2.doFilter(wReq, wRes);
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}

}
