import java.io.*;
class K
{
	public static void main(String[] args) 
	{

		File f1 = new File("S:/class/sep-4th batch/java/49.File Handling/src/dir1");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
//incase of directory we didn't get exception if the specified path is not available
//it simply returns false