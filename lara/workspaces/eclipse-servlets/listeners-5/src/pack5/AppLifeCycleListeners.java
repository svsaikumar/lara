package pack5;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class AppLifeCycleListeners implements ServletContextListener {

  
    public AppLifeCycleListeners()
    {
        // TODO Auto-generated constructor stub
    }

    public void contextInitialized(ServletContextEvent arg0) 
    { 
        System.out.println("app started");
    }
    
    public void contextDestroyed(ServletContextEvent arg0) 
    { 
    	 System.out.println("app stopped");
    }
	
	
}
//when application is starting, ServletObject is creating
//whenever  Servlet obj is created automatically ContecxtIntiailized() will execute

//whenever application  is stopping, ServletContext object is destroying
//whenever Servlet object is destroyed, automatically Conextdestroyed() will execute

//These 2 methods are life cycle events for SErveltcontext object