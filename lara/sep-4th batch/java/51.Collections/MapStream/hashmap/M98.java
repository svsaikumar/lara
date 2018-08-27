import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;


import java.util.Map;
class  M98 
{
	
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 300);
		map.put("test", 505);
		map.put("xyz", 500);
		map.put("hello", 34);
		map.put("hello1", 774);
		System.out.println(map);
		
		Set entries = map.entrySet();
		
		TreeSet set1 = new TreeSet(
			new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;

				Integer value1 = (Integer) e1.getValue();
				Integer value2 = (Integer) e2.getValue();
				return value1-value2;
			}
		});
		set1.addAll(entries);
		System.out.println(set1);
	}
}

//from map getentryset
//by defalutl Treemap has a feature of autosorting
//inside set1 elements are entry objects
//getvalue() method return type is "object" type.
//o1 downcasted to Entry
//o1.getvalue() is getting in the form of object.so down casting to "Integer"
//Treeset() internally uses "comparator"