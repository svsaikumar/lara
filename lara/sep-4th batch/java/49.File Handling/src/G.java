import java.io.*;
class G
{
	public static void main(String[] args) 
	{


		File f1 = new File("S:/class/sep-4th batch/java/49.File Handling", "Test.java");
		System.out.println(f1.exists());
		try
		{
			System.out.println(f1.createNewFile());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(f1.exists());
	}
}
//here path is the first argument and second argument is file name
//instead of mixing the both we can mention them separately

//inside File class, there are several constructers, 
//here it calls constructer 2 argument constructer, first argument is for path, and second argument is for name of file