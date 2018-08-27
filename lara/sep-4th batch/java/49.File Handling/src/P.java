import java.io.*;
class P 
{
	public static void main(String[] args) throws IOException 
	{

		File f1 = new File("data.txt");
		FileWriter out = new FileWriter(f1);
		out.write("Hello to all\n");
		out.write("Hello \n to all\n");
		out.write("Hello to all");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
// wherever we want there we can use \n inorder to go to next line
//in FileWriter there is no built in method to print the content in the next line so we have to use \n explicitly