import java.util.TreeSet;
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
class B implements Comparator
{
	public int compare(Object obj1, Object obj2)//defining compareTo() method of Comparable interface
	{
		return ((A)obj1).i - ((A)obj2).i;//compare method downcasting to A type
	}
}
class M52
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet(new B());
		set.add(new A(90));
		set.add(new A(0));
		set.add(new A(10));
		set.add(new A(900));
		set.add(new A(190));
		set.add(new A(920));
		System.out.println(set);
	}
}