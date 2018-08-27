import java.io.*;
class X
{
	public static void main(String[] args)
	{



		File f1 = new File("data3.txt");
		char[] chars = new char[(int) f1.length()];
		try(FileReader fin = new FileReader(f1))
		{
			fin.read(chars);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
//we can close through auto resource closing
//inside a filewriter there is no built in file it goes to the next line
//in filereader also there is no scope of reading the file line by line
//in filereader there is no method to read the content lineby lint
//in file writer there is no method to write the content alone after line
//filereader and filewrite not using any buffer,and because of no buffer performance will be very less
//by using 'FileReader' we can read the character content into the file system


//there is no built in method for producing new line incase of FileWiriter and FileReader
//there is no mechanism to read the content line by line
//Buffer mechanism is not using by FileWiriter and FileReader.
//Without buffer, operations will be very expensive.
//FileWiriter and FileReader are considered as raw objects
//means we can achieve the operation, but not in best way