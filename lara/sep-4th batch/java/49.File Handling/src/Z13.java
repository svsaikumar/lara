import java.io.*;
class Z13
{
	public static void main(String[] args) throws IOException
	{


		PrintStream pout = new PrintStream("test2.log");
		PrintStream sout = System.out;
		System.out.println(1); //c
		pout.println(2);	//file system
		sout.println(3);	//c
		System.setOut(pout);//changing system.class to pout
		System.out.println(4);//here it is "pout.println(4);"//f
		pout.println(5);	//f
		sout.println(6);	//c
		System.setOut(sout);//changing System.class to sout
		System.out.println(7);//here it is "sout.println(7);//c
		pout.println(8);	//f
		sout.println(9);	//c
	}
}
//system is ca contrete in java.lang package
//'out' is a static reference variable with data type as printStream
//'println' is a non static method from "printStream" class 
