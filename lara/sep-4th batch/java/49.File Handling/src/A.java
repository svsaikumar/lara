import java.io.*;
class A
{
	public static void main(String[] args) throws IOException
	{


		File f1 = new File("abc.txt");
		System.out.println(f1.exists());//checks that file is available or not
		System.out.println(f1.createNewFile());//creates new file if there is no such type of file and returns true
												//returns false if already file exists				
		System.out.println(f1.exists());//checks that file is available or not
	}
}
//file handling
//inorder to interact with a file system from a java program we have to use "java.io.*"
//from java.io package only we are using file class and io exception we are using
//inside io package several packages is available
//for createNewFile() method  is a checked type of exception it requires try-catch or throws