import java.io.*;
class Person implements Externalizable
{
	String firstName;
	Integer age;
	Double weight;

	public void writeExternal(ObjectOutput out) throws IOException 
	{//here this is'p1'
		//out.writeUTF(firstName);
		out.writeInt(age);//this.age/p1.age
		out.writeDouble(weight);//this.weight/p1.weight
	}
	public void readExternal(ObjectInput in) throws IOException , ClassNotFoundException
	{//this is "p2"
		//firstName = in.readUTF();
		age = in.readInt();//this.age/p2.age
		weight =in.readDouble();//this.weight/p2.weight

	}
}
class Z22
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.firstName = "Ramu";
		p1.age = 33;
		p1.weight = 55.5;


		try(FileOutputStream fout = new FileOutputStream("test7.ser"); 
			ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			p1.writeExternal(out);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println(p1.firstName);
		System.out.println(p1.age);
		System.out.println(p1.weight);

		Person p2 = new Person();//here it will create with defalutl cvalues
		try(FileInputStream fin = new FileInputStream("test7.ser"); 
			ObjectInputStream in = new ObjectInputStream(fin))
		{
			p2.readExternal(in);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(p2.firstName);
		System.out.println(p2.age);
		System.out.println(p2.weight);
	}
}
//Externalization is writing or reding object state into file system attribute by attribute
//Externalizable interface extending with serializable interface(marlker interface)
//Externalizable interface is not marker interface .it has 2 abstract methods(i.e writeExternal() and readExternal())
//inside WriteExternal we can write which ever attribues we want to into file system one by one
//UTF = univeral text format
//if we want to wirte String object use "writeUTF()"
// readeExternal() is used to read object data attribute by attribute
//incase of readExternal() method order of reading should same as order of writing
//the file created in serialization is bigger than exernalizable
//incase of serializable ,file properties also stored in the filesystem in addition to object data
//incase of Externalizable ,only object data is stored
//Externalizable is an enhancement of serializable