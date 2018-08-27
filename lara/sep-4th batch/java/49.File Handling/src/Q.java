import java.io.*;
class Q 
{
	public static void main(String[] args) throws IOException 
	{


		FileWriter out = new FileWriter("data2.txt");
		out.write("Hello to all\n");
		out.write("Hello \n to all\n");
		out.write("Hello to all kumar");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
//here there is no file object
//no need to specify the file name, we can directly specify the name to FileWriter
//FileWriter can directly interact with file