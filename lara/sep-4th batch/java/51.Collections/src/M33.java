import java.util.PriorityQueue;
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
class M33
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue(
				(o1, o2) ->  ((A)o1).i - ((A)o2).i);
		queue.add(new A(90));
		queue.add(new A(910));
		queue.add(new A(190));
		queue.add(new A(20));
		queue.add(new A(56));
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
//we have to supply comparator object through constructer
//lambda expressions