import java.io.*;
class A implements Serializable 
{
}
class B extends A
{
	int i;
}
class Z7
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.i = 10;
		B b2 = new B();
		b2.i = 100;
		B b3 = new B();
		b3.i = 1000;
		try(FileOutputStream fout = new FileOutputStream("test2.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		FileInputStream fin = new FileInputStream("test2.ser");
		ObjectInputStream in = new ObjectInputStream(fin))
		{
			out.writeObject(b1);
			out.writeObject(b2);
			out.writeObject(b3);


			B obj1 = (B) in.readObject();
			B obj2 = (B) in.readObject();
			B obj3 = (B) in.readObject();
			System.out.println(obj1.i);
			System.out.println(obj2.i);
			System.out.println(obj3.i);
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
//we can seriliaze any number of objects
//any number of objects can be written to the same file system(we will get in the same order at what we have developed) 
//serialization is "is a" relationship
//if super class object is implementing serializable then sub-class object is also eligible for serialization
//we can seriliaze any number of objects
//b1 content assigning to obj1
//b2 content assigning to obj2
//b3 content assigning to obj3