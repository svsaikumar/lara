import java.util.HashMap;
class M66
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		System.out.println(map.put("abc", 34));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put("abc", 44));//34 is replacing with 44.
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put("abc", 54));//44 is replacing with 54
		System.out.println("================");
		System.out.println(map);
	}
}
//while storing , first value, 34 is stored in map successfully and returning "null"
//one key can't be for 2 values
//whatever is reaplacing , it is returning
//while storing any value for key first time, it returns null value
//inside Stream class, hashcode() and equals() methd got overrided