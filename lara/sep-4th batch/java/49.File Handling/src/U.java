import java.io.*;
class U
{
	public static void main(String[] args) throws IOException
	{


		File f1 = new File("data3.txt");
		FileReader fin= new FileReader(f1);
		char[] chars = new char[10];//empty character array
		fin.read(chars);//to read from data3.txt file
		//System.out.println(chars);
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
//to read the character data from file r system we use 'FileReader'
//we are trying to read some content from file system
//it send only 10 characrets to array from file system
//read() taking character array