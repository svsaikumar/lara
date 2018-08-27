import java.util.HashMap;
class M65
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 34);
		map.put(20, "test");
		map.put(4.4, true);
		map.put(false, 'a');

		System.out.println(map);
		System.out.println(map.get(20));
		System.out.println(map.get(false));
		System.out.println(map.get("test"));//here there is no key as "test", so it returns "null"
		System.out.println(map);
		
	}
}
//if we specifying a key which is not available , then we will get null