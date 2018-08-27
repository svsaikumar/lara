import java.util.PriorityQueue;
class M27
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(20);
		queue.add(0.0);
		queue.add(0);
		queue.add(200);
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
//for sorting in queue also, all the elements should be of same data type
//auto sorting is there for "PriorityQueue" type(but all the elemets should be of same type)
//Collectin API is onlu for ojects not lfor primitives
//while storing primitive, it is automatically boxing to Wrapper objects incase of collections
//priority queue having auto sorting