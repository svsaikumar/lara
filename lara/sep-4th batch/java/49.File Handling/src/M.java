import java.io.*;
class M
{
	public static void main(String[] args) 
	{




		File f1 = new File("S:/class/sep-4th batch/java/49.File Handling");
		File f2 = new File(f1, "dir3");
		System.out.println(f2.exists());
		System.out.println(f2.mkdir());
		System.out.println(f2.exists());
	}
}
//here for the first we get false for mkdir(), as the path didn't contains the directory, and creates that directory
//for directory also we can specify path in one argument and directory name in another argument