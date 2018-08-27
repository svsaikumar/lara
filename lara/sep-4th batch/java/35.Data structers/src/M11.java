class Node
{
	int i ;
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
	void add(int i)//inside add this is list
	{
		Node element = new Node(i);
		if(first == null)
		{
			first = element;//list.first = element
		}
		else
		{
			last.ref = element;//list.last.ref = element;
		}
		last = element;//list.last = element;
	}					//this.last = element;
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
class M11
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.iterate();
	}
}
