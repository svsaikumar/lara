import java.io.*;
class M4
{
	public static void main(String[] args) throws IOException
	{

		Person p1 = new Person("abc", 22, 4.5);
		FileOutputStream fout = new FileOutputStream("test2.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(p1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("done");
	}
}