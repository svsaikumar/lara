import java.util.PriorityQueue;
class M28
{
	public static void main(String[] args) 
	{



		PriorityQueue queue = new PriorityQueue();
		queue.add(new );
		queue.add(910);
		queue.add(190);
		queue.add(20);
		//queue.add(null);
		queue.add(0);
		queue.add(200);
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
//while sorting, there should not be null(we will get NullPointerException)
//"priorityqueue" have autosorting so it internally calling compareTo() method