package pack5;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;


public class AppAttributeListeners implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public AppAttributeListeners()
    {
        // TODO Auto-generated constructor stub
    }
    public void attributeAdded(ServletContextAttributeEvent arg0) 
    { 
         System.out.println("app  context attr added");
    }
    public void attributeRemoved(ServletContextAttributeEvent arg0) 
    { 
    	System.out.println("app context attr removed");
    }
    public void attributeReplaced(ServletContextAttributeEvent arg0)
    { 
    	System.out.println("app context attr replaced");
    }
}
//whenever ServletContext obj is creating