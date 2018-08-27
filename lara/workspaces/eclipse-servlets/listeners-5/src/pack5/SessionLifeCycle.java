package pack5;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionLifeCycle
 *
 */
public class SessionLifeCycle implements HttpSessionListener {

    
    public SessionLifeCycle()
    {
       
    }

	
    public void sessionCreated(HttpSessionEvent arg0) 
    { 
         System.out.println("session started");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("session destroyed");
    }
	
}
