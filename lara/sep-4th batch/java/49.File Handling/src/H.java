import java.io.*;
class H
{
	public static void main(String[] args) 
	{


		File f1 = new File("S:/class/sep-4th batch/java/49.File Handling");
		File f2 = new File(f1, "Test.java");
		System.out.println(f2.exists());
		try
		{
			System.out.println(f2.createNewFile());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(f2.exists());
	}
}
//path is specifying through f1
//file name is specifying through f2
//file class is not only for creating the files but also for directory purpose
//use file class for both creating the files and directory also
//f1 is file object which representing path
//