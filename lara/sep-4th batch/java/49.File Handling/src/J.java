import java.io.*;
class J
{
	public static void main(String[] args) 
	{
		File f1 = new File("S:/class/sep-4th batch/java/49.File Handling/New Folder/dir1");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
//any location we can specify
//we can absolute path where directory has to create
//if returns false if specified is not available,instead of rising an exception(this is only for directory creation
//but not for file creation