import java.io.*;
class E
{
	public static void main(String[] args) 
	{


		File f1 = new File("S:/class/sep-4th batch/java/49.File handling/New folder.html");
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
//forward slash is recommended as there is no need to escape.one forward slash is enough
//and linux operating supports only forward slash as a separator
//if there is no representation of path, then it will create in the current directory