package pack5;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


public class Person implements HttpSessionBindingListener 
{

   
	
	
	
	//implement all person related attributes, constructors and methods
    public Person() 
    {
        // TODO Auto-generated constructor stub
    }
    public void valueBound(HttpSessionBindingEvent arg0)  
    { 
         System.out.println("valueBound executed");
    }
    public void valueUnbound(HttpSessionBindingEvent arg0) 
    { 
         System.out.println("valueUnBound executed");
    }
}
//it is not required to register binding type of listeners in web.xmlh