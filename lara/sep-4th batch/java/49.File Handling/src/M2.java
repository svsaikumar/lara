import java.io.*;
class  A implements Serializable
{
	int i;
}
class M2
{
	public static void main(String[] args) throws IOException
	{

		A a1 = new A();
		a1.i = 20;

		FileOutputStream fout = new FileOutputStream("test1.doc");//we can chooose any file extent
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("done");
	}
}
//A is of serializable type
//now object of A is eligible for serializable
//object conetn writing into file system
//Serializable is a marker interface(an interface which doesn't have a  single member)
//be default objects are not eligible for serialization
//only serializable objects are eligible for serialization
//binary object storing inthe file system
//all attributes are writing into the system(ignoring the no.of attributes)
//entire object is writing into the system

