class Node
{
	int i;
	Node ref;
	Node (int i)
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
			last.ref = element;
		}
		last  = element;
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
class Z 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(30);
		list.iterate();
		
	}
}
