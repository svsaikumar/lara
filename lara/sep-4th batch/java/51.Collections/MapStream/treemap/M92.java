import java.util.TreeMap;
class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
}

class M92
{
	public static void main(String[] args) 
	{

		TreeMap map= 
			new TreeMap((obj1, obj2) ->  ((A)obj1).i - ((A)obj2).i);

		System.out.println(map.put( new A(22), "abc"));
		System.out.println(map.put( new A(2), 3.4));
		System.out.println(map.put( new A(24), 'a'));
		System.out.println(map.put( new A(5), 'a'));
		System.out.println(map.put( new A(26), 'a'));
		System.out.println(map.put( new A(10), true));
		System.out.println(map);
		System.out.println("tailMap of 5:" + map.tailMap(new A(5)));//specified element is inclusive by default
		System.out.println("tailMap of 10:" + map.tailMap(new A(10), true));//specified element is inclusive by defaut
		System.out.println("tailMap of 22:" + map.tailMap(new A(22), false));//specified element is inclusive
	}
}
//"TreeMap" has a feature of autosorting
//all keys should be of same type, no null as key is alloweod(but null as value is allowed)