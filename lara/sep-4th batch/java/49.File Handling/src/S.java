import java.io.*;
class S
{
	public static void main(String[] args) 
	{



		FileWriter out = null;//"out" can be used in try and finally as it is declared out of try
		try						//out should be declared before usage
		{
			out = new FileWriter("data3.txt", true);//all statements need IO exception so we keep them inside try
													// if we get exception here, then "out". will be null
			out.write("Hello to all\n");			//initializing file writer using FileWriter
			out.write("Hello \n to all\n");
			out.write("Hello to all");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally//final block will execute in every execution
		{
			try
			{
				if(out != null)//out is initialized inside try we can't use it outside
				{
					out.flush();//checked type of exception for IOexception.so it requires separate try-catch
					out.close();//checked type of exception for IOexception.so it requires separate try-catch
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("done");
		}
	}
}
//write() method required IOException
//throws is not required when we are using try-catch
//inside try we can mention any number of IO exceptions
//inside final block if we are performing any we have to check it, if it is not null then only it is processed
//inside try we can establish a  connectin with a file system
//inside a final block try to perform mandatory operations
//as soon as try is executed resources will be closed

//before try, 'out' got initialized with null
//if 'out' is null, and we call flush() or close() then we will get nullPointerException