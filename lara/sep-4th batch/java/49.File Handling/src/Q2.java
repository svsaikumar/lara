import java.util.LinkedHashMap;
class  Q2
{
	public static void main(String[] args) 
	{

		LinkedHashMap map = new LinkedHashMap();
		map.put('r', 2.0);
		map.put('w', "abc");
		map.put('s', true);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.size());
		map.clear();
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.size());
	}
}
//any thing can be send as string