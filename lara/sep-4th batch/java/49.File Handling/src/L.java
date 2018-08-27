import java.io.*;
class L
{
	public static void main(String[] args) 
	{



		File f1 = new File("S:/class/sep-4th batch/java/49.File Handling","dir2");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
//for directory also we can specify path in one argument and file name in another argument