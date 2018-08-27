import java.util.LinkedHashMap;
class  M79
{
	public static void main(String[] args) 
	{

		LinkedHashMap map = new LinkedHashMap();
		System.out.println(map.put( 22, "abc"));
		System.out.println(map.put( 23, 3.4));
		System.out.println(map.put( 24, 'a'));
		System.out.println(map.put( 25, 'a'));
		System.out.println(map.put( 26, 'a'));
		System.out.println(map.put( 20, true));
		System.out.println(map);
	}
}
//linkedhashmap preserves order
//we will get output in the order as we inserted