import java.io.*;
class Y
{
	public static void main(String[] args) throws IOException 
	{


		FileWriter out = new FileWriter("data4.txt");
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("Hello to all");
		bout.newLine();//calling new line method which bring the carriage to the next line
		bout.write("Hello to all");
		bout.write("Hello to all");
		bout.newLine();
		bout.write("Hello to all");
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");
	}
}
//BufferedWriter didn't involve with File directly there should be writer as intermediate
//by using filewriter defining buffer writer on the top of FileWriter
//whenever we want to print the content in nextline call newLine() method(which is available in BufferedWriter class)
//this method is not advisable because when an exception occurs in the middle the next statements are execting 
//and we can't close
//bufferwriter flushing and closing but filewriter is only closing