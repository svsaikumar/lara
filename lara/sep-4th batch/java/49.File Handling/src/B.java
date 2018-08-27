import java.io.*;
class B
{
	public static void main(String[] args) 
	{



		File f1 = new File("hello.txt");
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
//instead of throws we are using try-catch here