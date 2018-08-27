import java.util.Hashtable;
class  M77
{
	public static void main(String[] args) 
	{

		Hashtable table = new Hashtable();
		System.out.println(table.put( 22, "abc"));
		System.out.println(table.put( null, 3.4));//null pointer exception
		System.out.println(table.put( 24, 's'));
		System.out.println(table);
	}
}
//hashtable doesn't  allows null as a key , null as  value
//if we use null values inside hashtable we will get NullPointerException
