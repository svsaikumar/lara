import java.util.HashMap;
import java.util.Set;
class M95
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 30);
		map.put(30, "test");
		map.put(false, 500);
		map.put("hello", 'a');
		System.out.println(map);
		Set keys = map.keySet();
		for(Object key : keys)
		{
			System.out.println(key + ":" + map.get(key));
		}
	}
}
//get(key) method firsrt reads the key, and printing the corresponding values
//if we don't any thing about the keys in the map, use this approach