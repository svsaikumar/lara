import java.util.HashSet;
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
	public int hashCode()//overrided
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)//overrided
	{
		return (obj instanceof A && ((A)obj).i == i);
	}
}
class M40
{
	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.size());
		System.out.println(set);
	}
}
//here hashcode() and equals() got overrided.now they are checking the content of the object