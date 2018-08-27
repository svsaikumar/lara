import java.io.PrintStream;
class Z10 
{
	public static void main(String[] args) 
	{


		PrintStream p1 = System.out;
		p1.println("done");
		p1.println("done");
		p1.println("done");
		p1.println("done");
		p1.println("done");
		p1.println("done");
		p1.println("done");
	}
}
//println is nonstatic
//System.out is a static
//inside 'System' class 'out' is one static reference varaible with data type as 'PrintStream'
/*PrintStream class provides methods to write data to another stream. 
  The PrintStream class automatically flushes the data so there is no need to call flush() method. 
  Moreover, its methods don't throw IOException.
*/