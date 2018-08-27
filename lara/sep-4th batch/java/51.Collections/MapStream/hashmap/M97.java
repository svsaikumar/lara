import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
class M97
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 30);
		map.put(30, "test");
		map.put(false, 500);
		map.put("hello", 'a');
		System.out.println(map);
		Set entries = map.entrySet();
		//Collection entries = map.values();
		System.out.println(entries);
		Map.Entry entry;//"entry" data type is "Map.Entry"
		for(Object obj : entries)
		{
			entry = (Map.Entry)obj;//obj is downcasting to "Map.entry" type
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
}
//entryset() is retriveing every element from the map and Storing in "entries" Set
//all elements from map is inheriting to Set