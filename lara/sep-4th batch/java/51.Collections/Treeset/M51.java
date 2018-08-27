import java.util.TreeSet;
class A implements Comparable
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
	public int compareTo(Object obj)//defining compareTo() method of Comparable interface
	{
		return (i - ((A)obj).i);
	}
}
class M51
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet();
		set.add(new A(90));
		set.add(new A(0));
		set.add(new A(10));
		set.add(new A(900));
		set.add(new A(190));
		set.add(new A(920));
		System.out.println(set);
	}
}