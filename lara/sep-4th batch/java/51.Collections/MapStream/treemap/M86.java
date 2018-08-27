import java.util.TreeMap;
import java.util.Comparator;
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
class  M86
{
	public static void main(String[] args) 
	{

		TreeMap map= new TreeMap(new Comparator()
			{
				public int compare(Object obj1, Object obj2)
				{
					return ((A)obj1).i - ((A)obj2).i;
				}
			});
		System.out.println(map.put( new A(22), "abc"));
		System.out.println(map.put( new A(2), 3.4));
		System.out.println(map.put( new A(24), 'a'));
		System.out.println(map.put( new A(5), 'a'));
		System.out.println(map.put( new A(26), 'a'));
		System.out.println(map.put( new A(10), true));
		System.out.println(map);
	}
}
//"TreeMap" has a feature of autosorting
//all keys should be of same type, no null as key is alloweod(but null as value is allowed)