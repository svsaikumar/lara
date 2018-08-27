import java.util.PriorityQueue;
class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	/*public String toString()
	{
		return "i = " + i;
	}
	*/
}
class M29
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
	}
}
//here we get exception becausle for comparision purpose,  A should be of comparable type which are not here