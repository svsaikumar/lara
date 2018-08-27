import java.io.*;
class Z23
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.i = 100;


		try(FileOutputStream fout = new FileOutputStream("test7.ser"); 
			ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(t1);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

	}
}