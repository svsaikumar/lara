import java.util.PriorityQueue;
class M25
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(20);
		queue.add(0);
		queue.add(10);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
//under queue if we want to achieve sorting, then we java to go for priority queue
//poll() method is used to read and remove the min.value element from the queue and sorting is happening to only head element
//priority is a perfect queue so first element is the sorted element of all other
//in the prioruty queue there is no chancave of reading apart from the first element in the queue
//we can't call get() method as there is no index for queue type(under list type only get() method is there)
//there is no get() method under "queue"