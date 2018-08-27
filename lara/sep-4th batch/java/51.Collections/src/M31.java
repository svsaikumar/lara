import java.util.PriorityQueue;
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
	public int compare(Object o1, Object o2)//defining compareTo() method of Comparable interface
	{
		return ((A)o1).i - ((A)o2).i;//compare method downcasting to A type
	}
}
class M31
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue(new B());//supplying comparator object through constructer
		queue.add(new A(90));
		queue.add(new A(910));
		queue.add(new A(190));
		queue.add(new A(20));
		queue.add(new A(56));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
//we have to supply comparator object through constructer