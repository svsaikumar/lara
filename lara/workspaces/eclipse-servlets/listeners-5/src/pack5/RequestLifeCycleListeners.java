package pack5;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


public class RequestLifeCycleListeners implements ServletRequestListener 
{ 
	
	
	
	
    public RequestLifeCycleListeners()
    {
        // TODO Auto-generated constructor stub
    }
    public void requestDestroyed(ServletRequestEvent arg0) 
    { 
        System.out.println("request Destroyed");
    }
    public void requestInitialized(ServletRequestEvent arg0)
    { 
    	 System.out.println("request started");
    }
	
}
//only binding type of listener need not to be registered in web.xml, remaining all need to register
//request object is only for current request(smallest scope)-only for one request
//session object = only for one user
//ContextObject = for entire application