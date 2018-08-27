import java.util.HashMap;
import java.util.TreeMap;
class  M80
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		System.out.println(map.put( 22, "abc"));
		System.out.println(map.put( 2, 3.4));
		System.out.println(map.put( 24, 'a'));
		System.out.println(map.put( 5, 'a'));
		System.out.println(map.put( 26, 'a'));
		System.out.println(map.put( 10, true));
		System.out.println(map);

		TreeMap map1 = new TreeMap(map);
		System.out.println(map1);
	}
}
//linkedhashmap preserves order
//we will get output in the order as we inserted

//Treemap sorts the keys inthe ascending order
//for treemap the data type of all the keys should be same(as it is involving in autosorting)
//based on the keys only sorting is happening
//there should not be key as null for sortring.so Treemap won't allow 'null' as key