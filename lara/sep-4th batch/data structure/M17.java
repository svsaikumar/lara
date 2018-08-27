class Node
{
	int i;
	Node nextRef;
	Node prevRef;
	Node(int i)
	{
		this.i = i;
	}
}
class LinkedList
{
	Node first;
	Node last;
	void add(int i)
	{
		Node element = new Node(i);
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.nextRef = element;
		}
		element.prevRef = last;
		last = element;
	}
	void iterate()
	{
		Node current = first;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.nextRef;
		}
	}
	void reverseIterate()
	{
		Node current = last;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.prevRef;
		}
	}
}
class M17
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		System.out.println("--------");
		list.iterate();
		System.out.println("--------");
		list.reverseIterate();
	}
}
