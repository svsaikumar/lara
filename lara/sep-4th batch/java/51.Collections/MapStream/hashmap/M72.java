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
class M72
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		System.out.println(map.put(new A(90), 34));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(new A(90), 44));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(new A(90), 54));
		System.out.println("================");
		System.out.println(map);
	}
}
//here hashcode() and equals() methods checking the content(content is same for all the 3 objects)
//not checking teh memory location
//3 object are created