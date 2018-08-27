import java.io.*;
class T
{
	public static void main(String[] args) 
	{
		

		try(FileWriter out = new FileWriter("data3.txt", true))
		{										
			out.write("Hello to all\n");
			out.write("Hello \n to all\n");
			out.write("Hello to all");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//autoresource closing
//whichever resource in the paranthsis of try that will be automatically closed after try execution(auto resource closing)
//we don't require to close it explicitly
//Filewriter, it implements closable interface
//all closable resources can be opened in try paranthesis