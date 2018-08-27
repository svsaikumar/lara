import java.io.*;
class Z12
{
	public static void main(String[] args) throws IOException
	{


		PrintStream pout = new PrintStream("test1.log");
		System.setOut(pout);//this statement makes lot of changes in the program
		System.out.println("Hello World!");//this data is priting in "test1.log" file but not in command
		System.out.println("Hello World!");//this data is priting in "test1.log" file but not in command
		System.out.println("Hello World!");//this data is priting in "test1.log" file but not in command
		System.out.println("Hello World!");//this data is priting in "test1.log" file but not in command
		System.out.println("end");//this data is priting in command only
	}
}
//setout used to  modify default printStream of system class
//inside sytem class 
//all the sop are printlng in the test1.log