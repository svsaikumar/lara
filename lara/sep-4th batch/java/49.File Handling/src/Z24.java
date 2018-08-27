import java.io.*;
class Z24
{
	public static void main(String[] args)
	{
		
		
		try(FileInputStream fin = new FileInputStream("test7.ser"); 
			ObjectInputStream in = new ObjectInputStream(fin))
		{
			Test t1 = (Test) in.readObject();
			System.out.println(t1.i);
			System.out.println(t1.i);
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
//while seiralizing any object that object serialversionUID also storing in to the file system
//while deserialization if filesystem(stream class) object serial verisonuid and local class object serialversion UID are different we will get an exception
/*S:\class\sep-4th batch\java\49.File Handling\src>serialver Test
Test:    private static final long serialVersionUID = -8733344177675629280L;
*/

//whenever changes in the members, comiler chanegws serialversionUID number
//