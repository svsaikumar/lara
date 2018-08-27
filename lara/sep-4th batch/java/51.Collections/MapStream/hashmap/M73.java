import java.util.HashMap;
class A
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
	public int hashCode()//overriding
	{
		return Integer.toString(i).hashCode();
	}
	@Override
	public boolean equals(Object obj)//overriding
	{
		return (obj instanceof A && ((A)obj).i ==i);
	}
}
class M73
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		System.out.println(map.put(new A(90), 34));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(new A(91), 44));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(new A(92), 54));
		System.out.println("================");
		System.out.println(map);
	}
}
//here hashcode() and equals() methods checking the content(content is different for all the 3 objects)
//not checking the memory location
//3 object are created