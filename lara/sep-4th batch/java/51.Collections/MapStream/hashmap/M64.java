import java.util.HashMap;
class M64 
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 34);
		map.put(20, "test");
		map.put(4.4, true);
		map.put(false, 'a');

		System.out.println(map);
		int i = (Integer) map.get("abc");//by using key we are reading "value".
		boolean j = (Boolean) map.get(4.4);//by using key we are reading "value"
		System.out.println(i);
		System.out.println(j);
	}
}
//get() method is taking the key and returning the assigned element
//get() method return type is object type