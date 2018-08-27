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
class M68
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
//here hashcode() and equals() acting as object class methods, they are checking the memory locatin of object(not content of object)
//