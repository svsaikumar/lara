import java.util.HashMap;
class M63 
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		map.put("abc", 34);
		map.put(20, "test");
		map.put(4.4, true);
		map.put(false, 'a');

		System.out.println(map);
	}
}
//put() method taking 2 argumenta(key as 1st arg, and value as 2nd argument)
//key and element can be any data type
//it is not maintaing the order
//insertion order is not preserved