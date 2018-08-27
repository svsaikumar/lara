import java.io.*;
class F
{
	public static void main(String[] args) 
	{


		File f1 = new File("D:/class/New folder -1.html");
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
//here it shows an IOException that the specified path is not available
//for new file creation the given path should be available
//if path is given then that path should be available, other wise we will get IOException as the system cannot find the path specified
//