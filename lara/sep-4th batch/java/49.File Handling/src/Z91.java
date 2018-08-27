import java.io.*;
class  A implements Serializable
{
	int i ;
	transient int j ;
}
class Z91
{
	public static void main(String[] args) throws Exception
	{
		A a1 = new A();
		a1.i = 10;
		a1.j = 20;

		FileOutputStream fout = new FileOutputStream("test4.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		fout.close();

		FileInputStream fin = new FileInputStream("test4.txt");
		ObjectInputStream in = new ObjectInputStream(fin);

		A a2 = (A) in.readObject();
		System.out.println(a2.i);
		System.out.println(a2.j);
	}
}
//if any variable is declared as transeint , it is not surviving in the serialization(that variale not writing inot the file system)

//serialization is a object wise operation(entire object at once)
//transient varaibles are not surviving inthe serialization
//we can use transient only for global variables