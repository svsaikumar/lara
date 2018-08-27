import java.io.*;
class V
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("data3.txt");
		FileReader fin= new FileReader(f1);
		char[] chars = new char[(int) f1.length()];//length() method for the file returning 'long' data type
										//so we are downcasting to 'int' type as the size of the array should be int only.
		fin.read(chars);//to read from data3 file
		String s1 = new String(chars);
		System.out.println(s1);
		fin.close();
	}
}
//array size type always should be int type
//long is converting to int type
//we should not use throws for resource(if sources are interacting), then it is advised to use try-catch
//inorder to close resources without fail, use try-catch , final(external resource)
//length() will be returning total number of charcters