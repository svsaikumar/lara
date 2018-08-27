import java.io.*;
class Z3 
{
	public static void main(String[] args) throws IOException
	{



		File f1 = new File("S:\\MI\\164.jpg");
		FileInputStream fin = new FileInputStream(f1);
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] bytes = new byte[(int) f1.length()];
		bin.read(bytes);
		bin.close();
		fin.close();



		File f2 = new File("test.jpg");
		FileOutputStream fout = new FileOutputStream(f2);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(bytes);
		bout.flush();
		bout.close();
		fout.close();

		System.out.println("done");
	}
}
//interacting with a binary file
//which ever file content cannot develop by human being , only possible for systems are called binary files
//inside binary file we can't develop content like
//audio files, DLL files, command files, all batch files, video files, all class files
//for reading purpose input stream, for writing purpose output stream or output stream along with buffered output strteam
//binary input reading binary array
//writing object state into persisting media(file system) - serialization
//reading object state from the file system into java program-deserialization

//binary data reading from file and writing into another file

//FileInputStream is to read binary data from the file system(reading the binary data character wise)
//FileOutputStream is to write the binary data into the file system(writign binary data character wise)

//BufferedInputStream is to read binary data from the file system(reading the binary data data line wise)
//BufferedOutputStream is to write the binary data from the file system(writing the binary data line wise)