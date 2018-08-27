import java.util.HashMap;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	@Override
	public String toString()//overriding
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
class M71
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		A a1 = new A(90);
		A a2 = new A(90);
		A a3 = new A(90);
		System.out.println(map.put(a1, 34));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(a2, 44));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(a3, 54));
		System.out.println("================");
		System.out.println(map);
	}
}
//here hashcode() and equals() methods checking the content(content is same for all the 3 objects)
//not checking teh memory location
//3 object are created