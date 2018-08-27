import java.io.*;
class A implements Serializable 
{
	int i ;
}


class B implements Serializable
{
	int j;
	A obj;
	String s1;
	Double d1;
}
class Z8
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;


		B b1 = new B();
		b1.obj = a1;
		b1.s1 = "abc";
		b1.d1 = 10.5;


		try(FileOutputStream fout = new FileOutputStream("test3.ser"); 
		ObjectOutputStream out = new ObjectOutputStream(fout);
		FileInputStream fin = new FileInputStream("test3.ser");
		ObjectInputStream in = new ObjectInputStream(fin))
		{
			out.writeObject(b1);
			B b2 = (B) in.readObject();
			System.out.println(b2.obj.i);
			System.out.println(b2.s1);
			System.out.println(b2.d1);
			
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//not only B is serializable but also the compomnents of B are also serializable('has a' relation)
//A also implementing serializable, String is implementing serializable, double is implementing serializable
//while B object is serializable, A also serializable
