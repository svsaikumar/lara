package pack4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet5() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ArrayList list = new ArrayList();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "Sekar");
		map1.put("age", "22");
		map1.put("weight", "58.6");
		list.add(map1);
	
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "Sekar");
		map2.put("age", "22");
		map2.put("weight", "58.6");
		list.add(map2);
		
		
		request.setAttribute("msg", list);
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet5.jsp");
		rd.forward(request, response);
	}

}
