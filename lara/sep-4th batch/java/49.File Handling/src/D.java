import java.io.*;
class D
{
	public static void main(String[] args) 
	{


		File f1 = new File("S:\\class\\sep-4th batch\\java\\49.file handling\\New folder");
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
//we can send the path where the file has to create
//in any location file can be created.we have to supply the specified path
//if we want to use backward slash in the string argument, that should be escaped with another backward slash