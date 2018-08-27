package pack5;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;


public class RequestAttributeListeners implements ServletRequestAttributeListener {

    public RequestAttributeListeners()
    {
  
    }
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  
    { 
         System.out.println("request attr removed");
    }
    public void attributeAdded(ServletRequestAttributeEvent arg0)  
    { 
    	System.out.println("request attr added ");  
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0) 
    { 
    	System.out.println("request attr replaced");  
    }
	
}
