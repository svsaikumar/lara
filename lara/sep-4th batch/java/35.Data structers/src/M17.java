class Node//double linked list
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
			System.out.print(current.i+", ");
			current = current.nextRef;
		}
	}
	void reverseIterate()
	{
		Node current = last;
		while(current != null)
		{
			System.out.print(current.i+", ");
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
		list.iterate();
		System.out.println("-----------------");
		list.reverseIterate();
	}
}
/*
double linked list...
there should be a reference frm first node to second node...second to first..
every node shudh have two references...one is pointing to rightsidenode..other is pointing to leftside node...
data ,ref1,ref2
firstnode prevRef is null..last node nextRef is null..

*/