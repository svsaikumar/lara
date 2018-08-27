import java.util.PriorityQueue;
import java.util.Collections;
class M26
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue(Collections.reverseOrder());
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(20);
		queue.add(0);
		queue.add(200);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
//