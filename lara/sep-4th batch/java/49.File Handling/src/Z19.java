import java.io.*;
class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A implements Serializable
{
	B()
	{
		System.out.println("B()");
	}
}
class Z19
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
//deserislization - reading the data from the file system
//A object can't be serializable only Objects can be serializable
//while deserializing
// jre creating object by calling constructers
//jre worrying about B members but not A class inherited members
