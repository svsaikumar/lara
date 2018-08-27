import java.util.PriorityQueue;
class A implements Comparable//comparable interface containing compareTo(), as A is subclass  to Comparable,
							//compareTo() has to implement in A class
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
		return -(i - ((A)obj).i);
	}
	
}
class M30
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
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
