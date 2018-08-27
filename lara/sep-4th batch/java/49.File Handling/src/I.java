import java.io.*;
class I
{
	public static void main(String[] args) 
	{


		File f1 = new File("dir1");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());// here if that directory is not there it returns false(and creates directory)
									   //if it is there, it returns true by not creating any directory
		System.out.println(f1.exists());
	}
}
//if there is no specific path, then directory is not created
//at that time it will not throw any exception, it simply returns false
//if there is no path it will not throw any exception, it simply returns false
//by using file class , we can create directory also
//mkdir() method didn't require a try-catch or throws as it is not checked type of exception to IOExcepotion
