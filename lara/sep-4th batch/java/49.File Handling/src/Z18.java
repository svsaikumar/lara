import java.io.*;
class A implements Serializable 
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		//super();
		System.out.println("B()");
	}
}
class Z18
{
	public static void main(String[] args)
	{
		B b1 = new B();
		try(FileOutputStream fout = new FileOutputStream("test4.ser"); 
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test4.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
				out.writeObject(b1);
				System.out.println("===========");
				B b2 = (B) in.readObject();
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
//