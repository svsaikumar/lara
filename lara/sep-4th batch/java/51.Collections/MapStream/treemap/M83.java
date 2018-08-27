import java.util.TreeMap;
class A//class A is not comparable.we get class cast exception
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	@Override
	public String toString()
	{
		return "(i=" + i + ")";
	}
	@Override
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof A && ((A)obj).i == i);
	}
}
class  M83
{
	public static void main(String[] args) 
	{

		TreeMap map = new TreeMap();
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