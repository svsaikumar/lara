import java.io.*;
class M3
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin  = new FileInputStream("test1.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		A a1 = (A) in.readObject();
		in.close();
		fin.close();
		System.out.println(a1.i);
	}
}
//serialization process is a single step process(entire object state writing into the file system in a single step)
//deserialization process is a single step proces(entire object state reading from the file system in a single step)
//here deserialization is happening