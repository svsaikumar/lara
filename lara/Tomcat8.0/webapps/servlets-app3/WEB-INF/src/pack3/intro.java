







/*
1.under servlet api there are 2 packages
--------------------------
	1.javax.servlet
	2.javax.servlet.http

2.javax.servlet(package)
-------------
	1.Servlet
	2.ServletConfig
	3.ServletContext
	4.ServletRequest
	5.ServletResponse
	6.GenericServlet
	7.Filter
	8.FilterConfig
	9.FilterChain
	10.RequestDispatcher

3.javax.servlet.http(package)
------------------
	1.HttpServlet
	2.HttpServletRequest
	3.HttpServletResponse
	4.HttpSession
	5.Cookie

4.Members of Servlet(interface)
------------------------------
	1.public abstract void init(ServletConfig) 
	2.public abstract ServletConfig getServletConfig();
	3.public abstract void service(ServletRequest, ServletResponse) throws ServletException,IOException;
	4.public abstract String getServletInfo();
	5.public abstract void destroy();

among the above 5 methods, 3(init(), service(), destroy() are life cycle methods, and 2 are non-lifecycle methods

5.Members of ServletConfig(interface)
------------------------------------
	1.public abstract String getServletName();
	2.public abstract ServletContext getServletContext();
	3.public abstract String getInitParameter(String);
	4.public abstract Enumeration getInitParameterNames();



9 abstract methods are inheritng to GenericServlet(5 from Servlet and 4 from ServletConfig)
		among these 9 methods, except service() ,remaining 8 methods are got implemented in GenericServlet

	in addition to these 9 methods there are some other methods incorporated in GenericServlet
	all the methods are concreter except service() method


//serializable is a marker interface from java.io package
//it is only for providing a mark of serilization(eligible for serialization)
//similar to that cloneable also
//serice() method implemntation is not same form every protocal, it is varied from protocal to protocal, so it is
//not implemented in GenericServlet
//reaaining all metods behaviour is same for all the protocal


6.GenericServlet
-----------------
	public abstract class GenericServlet implements _, _, _
	{
		private ServletConfig config;
		public void init(ServletConfig config) throws ServletException
		{
			this.config = config;
			init();
		}
		public void init()
		{

		}
		public ServletContext getServletContext()
		{
			return config.getServletContext();
		}
		public String getInitParameter(String name)
		{
			return config.getInitParameter(name);
		}
		...........
		...........
		...........

	}
	//genricservlet has two  init() methods
	//arg init(config) is inherited method from Servlet interface
	//no-arg init() method (it is blanck)
	//no-arg init() method is calling arg init() mehtods
	//servlet always looking arg init() method
	//all the getter() of
	//every method of GenericServlet deoends on argument of init() method
	//object given to init() metod by server is assigning to global attribute
	//initially config variable is null, it is assigning in init() method, if init() is not there, config will be null
		//and we will get NullPointerException remaninig places of GenrericServlet
	//every getter of genericservlet using config global attribute
	//arg-init() method has to be called before calling any getter methods
	//we can't create a generic servlet directly as it is abstrct class, we have to develop a subclass for that


	//every member of GenricServlet class is inheriting to HttpServlet class
	//according to Http protocal behaviour, service method got implemented in Httpservlet class

7.http methods
---------------
	1.GET
	2.HEAD
	3.POST
	4.PUT
	5.DELETE
	6.CONNECT
	7.OPTIONS
	8.TRACEw

different ways to make a call to server side resource through a http Protocal(based on the behaviour of all these 8 
ways to call server side resoure thourh a http protocal ,service() method got implementes in HttpServlet class
		among all the above methods, we will use GET and POST

8.HttpServlet.java
-------------------
	public abstract class HttpServlet extends GenericServlet
	{
		public void service(HttpServletrequest r1, HttpServletResponse r2) throws ServletException, IOException
		{
			String method = r1.getMethod();
			if("get".equalsIgnoreCase(method))
			{
				doGet(r1, r2);	
			}
			else if("post".equalsIgnoreCase(method))
			{
				doPost(r1, r2);	
			}
			...........
			...........
			...........

			public void doGet(HttpServletRequest r1, HttpServletResponse r2) throws Servletexception, IOException
			{
				throw new SomeException();
			}
			public void doPost(HttpServletRequest r1, HttpServletResponse r2) throws Servletexception, IOException
			{
				throw new SomeException();
			}
			...........
			...........
			...........
		}
	}
//service method got implemented based on the all the ways of calling the server resource throguh a http protocal
//we shouldn't execute these 8 methds directly , we have to overide and use it, if we didn;t override these 
	-methods and using directly, we will get exception
//not advidsable to override service() method in our servlet class
//not advidsable to override inti() method in our servlet class
//server is not looking for doGet or doPost...it looks for service()
//the service() method in HttpServlet is specialized method to handle all types of requests
//don't override arg-init() as it is perfeftly overrided in GenericServlet class
//don't override service() as it is perfeftly overrided in HttpServlet class
//if we overide init() in out servlet class, init() in GenricServlet will not execute
	-then global attribute will not initilize as it is overriding in GenericServlet init(config) method
//override noarg-init() method in our servlet class

//if we don't know about no-arg init() method, and we have overrided arg-init() methd in our servlet class
		-then call super.init() method from overriden init() method from servlet

		*/