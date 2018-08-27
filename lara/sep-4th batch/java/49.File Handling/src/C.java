import java.io.*;
class C
{
	public static void main(String[] args) 
	{


		File f1 = new File("test.doc");
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
//a file can be extended with any extension(html, java...)(even unknown extension)
//without extension also we can create a file
//even that extension is invalid also, we can create
//any type of file can be created