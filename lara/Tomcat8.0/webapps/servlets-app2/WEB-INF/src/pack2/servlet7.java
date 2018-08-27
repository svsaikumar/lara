import java.util.*;
public class Servlet7 extends HttpServlet  
{
	public void service(HttpServletRequest r1,HttpServletResponse r2)
		throws ServletException,IOException
	{
		PrintWriter out=r2.getWriter();
		Enumeration names=getInitParameterNames();
		String name,value;
		while(names.hasMoreElements())
		{
			name=(String)names.nextElement();
			value=getInitParameter(name);
			out.println(name+":"+value);
		}
	}
}
/*
after getting the init parameter.
if can't read constents of one servlet from another servlet
for setting purpose use param-name,param-values.
for out put purpose getinitParameter.
*/
		