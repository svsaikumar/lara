import java.io.*;
class A //vefiry one again
{
	int i;
	A()
	{
		i = 10;
		System.out.println("A()");
	}
}
class B extends A implements Serializable
{
	int j;
	B()
	{
		j = 20;
		System.out.println("B()");
	}
}
class Z201
{
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.i = 100;
		b1.j = 200;
		try(FileOutputStream fout = new FileOutputStream("test4.ser"); 
			ObjectOutputStream out = new ObjectOutputStream(fout);
			FileInputStream fin = new FileInputStream("test4.ser");
			ObjectInputStream in = new ObjectInputStream(fin))
		{
				out.writeObject(b1);
				System.out.println("===========");
				B b2 = (B) in.readObject();
				System.out.println(b2.i);
				System.out.println(b2.j);
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
//deserislization - reading the data from the file system
//
