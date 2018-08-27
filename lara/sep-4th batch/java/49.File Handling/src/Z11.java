import java.io.*;
class  Z11
{
	public static void main(String[] args) throws IOException
	{




		PrintStream pout = new PrintStream("test.log");//the default file extension is "log"
		pout.println("Hello to all");
		pout.println("Hello to all");
		pout.println("Hello to all");
		pout.println("Hello to all");
		System.out.println("done");
	}
}
//here there are 2 PrintStream(one which is created explicitly and other is inside 
//not only log we can use any file extension
//":System.out" also Printstream type