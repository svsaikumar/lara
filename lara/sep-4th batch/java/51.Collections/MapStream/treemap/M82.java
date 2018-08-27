import java.util.TreeMap;
class  M82
{
	public static void main(String[] args) 
	{

		TreeMap map = new TreeMap();
		System.out.println(map.put( 22, "abc"));
		System.out.println(map.put( 2, 3.4));
		System.out.println(map.put( 24, 'a'));
		System.out.println(map.put( 5, 'a'));
		System.out.println(map.put( 26, 'a'));
		System.out.println(map.put( 10, true));
		System.out.println(map);
	}
}
//"TreeMap" has a feature of autosorting
//all keys should be of same type, no null as key is alloweod