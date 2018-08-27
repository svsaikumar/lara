package pack8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Servlet2() 
    {
        super(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		File file = new File("S:\\MI\\New folder\\164.jpg");//specify image file path and name
		byte [] bytes = new byte[(int)file.length()];
		FileInputStream fin = new FileInputStream(file);
		fin.read(bytes);
		out.write(bytes);
		out.flush();
		fin.close();
	}	
}
//browser information, browser properties
//reading all the names of request header into Enumeration
//reading every name into enumeration
//response headers=reading some extra data about the original browser
