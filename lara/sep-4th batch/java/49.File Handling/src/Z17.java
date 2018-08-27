import java.io.*;
class  A implements Serializable
{
	int i;
	int j;
	//transient int j;
	int k;
	A(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		k = 0;//before serzlizxation we can modifications
		out.defaultWriteObject();//entire object writing into the file system
		out.writeInt(j);
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		in.defaultReadObject();//entire object writing into the file system
		j = 10;//after deser we can do modifications
	}
}
class Z17
{
	public static void main(String[] args)
	{
		A a1 = new A(10,20,30);
		try(FileOutputStream fout = new FileOutputStream("test4.ser"); 
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test4.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
				out.writeObject(a1);
				A a2 = (A) in.readObject();
				System.out.println(a2.i);
				System.out.println(a2.j);
				System.out.println(a2.k);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//we can't call defaultread or defaultwrite from outside as they are private