import java.util.Hashtable;
class  M78
{
	public static void main(String[] args) 
	{

		Hashtable table = new Hashtable();
		System.out.println(table.put( 22, "abc"));
		System.out.println(table.put( 23, 3.4));
		System.out.println(table.put( 24, null));//null pointer exception
		System.out.println(table);
	}
}