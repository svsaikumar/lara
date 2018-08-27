package pack5;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class SessionAttributesListeners
 *
 *
 *
 *
 *
 */
public class SessionAttributesListeners implements HttpSessionAttributeListener {

    
    public SessionAttributesListeners() 
    {
       
    }

    public void attributeAdded(HttpSessionBindingEvent arg0)
    { 
         System.out.println("attr added to session");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0) 
    { 
         System.out.println("attr removed from session");
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  
    { 
         System.out.println("attr replaced in session");
    }
	
}
