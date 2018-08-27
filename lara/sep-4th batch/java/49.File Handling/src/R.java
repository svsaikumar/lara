 import java.io.*;
class R
{
	public static void main(String[] args) throws IOException 
	{


		FileWriter out = new FileWriter("data3.txt", true);//second argument is append status
		out.write("sai\n");
		out.write("kumar \n");
		out.write("yadav");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
//by default append status is false
//here we are supplying true
//all are checked type exceptions to IOException
//if we use true, the content which we are giving is appending to the prvious content
//if we use false, the content which we are giving is printing in the file with erasing the previous content