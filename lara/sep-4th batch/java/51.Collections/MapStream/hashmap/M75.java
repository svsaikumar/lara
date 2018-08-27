import java.util.HashMap;
class  M75
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		System.out.println(map.put( 22, null));
		System.out.println(map.put( 23, null));
		System.out.println(map.put( 24, null));
		System.out.println(map);
	}
}
//hashmap allows null as a key , null as  value
//values can have duplicates
//becauese of different keys, no element is replacing