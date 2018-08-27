import java.util.Hashtable;
class  M76
{
	public static void main(String[] args) 
	{

		Hashtable table = new Hashtable();
		System.out.println(table.put( 22, "abc"));
		System.out.println(table.put( 23, 3.4));
		System.out.println(table.put( 24, 's'));
		System.out.println(table);
	}
}
//hashmap allows null as a key , null as  value
//values can have duplicates
//becauese of different keys, no element is replacing