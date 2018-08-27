import java.util.LinkedHashMap;
class Q3
{
	public static void main(String[] args) 
	{

		LinkedHashMap map = new LinkedHashMap();
		map.put('r', 2.0);
		map.put('w', "abc");
		map.put('s', true);
		System.out.println(map.keySet());
		System.out.println(map.containsKey('w'));
		System.out.println(map.containsKey('p'));
	}
}
//any thing can be send as string
//here 'w' is availabe as a key so it is true and 'p' is not available as akey so it prints false