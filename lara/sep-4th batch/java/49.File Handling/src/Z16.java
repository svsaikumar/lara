import java.io.*;
class  A implements Serializable
{
	int i;
	int j;
	int k;
	A(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		k = 0;
		out.defaultWriteObject();//entire object writing into the file system
	}
}
class Z16
{
	public static void main(String[] args)
	{
		A a1 = new A(10,20,30);
		try(FileOutputStream fout = new FileOutputStream("test4.ser"); 
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test4.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
				out.writeObject(a1);//it is not calling the default write object method
									//internally it is "a1.writeObject();"
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
//if we want ot call default write object() it should call from inside private writeObject() method in same entity class
//by the time of serializing
//if there is any confidential,then decalare that as transient
//any pre-execution before serialization
//the actaul value of k is not writing into the file system
//serializable is a object wise operation(entire object is writing into the file system)