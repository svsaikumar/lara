import java.util.HashMap;
class A//inside class A, hashcode() and equals() not overrided
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i=" + i + ")";
	}
}
class M70
{
	public static void main(String[] args) 
	{

		HashMap map = new HashMap();
		A a1 = new A(90);
		A a2 = a1;
		A a3 = a2;
		System.out.println(map.put(a1, 34));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(a1, 44));
		System.out.println("================");
		System.out.println(map);
		System.out.println("================");
		System.out.println(map.put(a1, 54));
		System.out.println("================");
		System.out.println(map);
	}
}