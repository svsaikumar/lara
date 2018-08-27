import java.util.HashMap;
class M94 
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 30);
		map.put(30, "test");
		map.put(false, 500);
		map.put("hello", 'a');
		System.out.println(map);
		System.out.println(map.keySet());
	}
}
