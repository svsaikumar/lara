class Node
{
	int i;
	Node ref;
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
		Node current = first;
		if(current == null)
		{
			first = element;
		}
		else
		{
			last = element;
			last.ref = first;
			first = last;

		}
	}
	void iterate()
	{
		Node current = first;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.ref;
		}

	}
}
class Z1
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
	//	list.add(50);
		list.iterate();
		System.out.println("-------------");
	}
}
