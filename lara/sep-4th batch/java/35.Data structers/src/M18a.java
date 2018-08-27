class Node
{
	int i;
	Node prevRef;
	Node nextRef;
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
	boolean set(int data1, int data2)
	{
		boolean status = false;
		Node current = first;
		while(current != null)
		{
			if(current.i == data1)
			{
				current.i = data2;
				status = true;
				break;
			}
			current = current.nextRef;
		}
		return status;
	}
	boolean insertion(int data1, int data2, int newData)
	{
		boolean status = false;
		Node prev = first, current = first;
		while(current != null)
		{
			if(prev.i == data1 && current.i == data2)
			{
				Node newNode = new Node(newData);
				status = true;
				prev.nextRef = newNode;
				newNode.prevRef = prev;
				newNode.nextRef = current;
				current.prevRef = newNode;
				break;
			}
			prev = current;
			current = current.nextRef;
		}
		return status;
	}

	void iterate()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.i+" ");
			current = current.nextRef;
		}
	}
	void reverseIterate()
	{
		Node current = last;
		while(current != null)
		{
			System.out.print(current.i+" ");
			current = current.prevRef;
		}
	}
}
class M18a
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
		list.iterate();
		System.out.println(list.insertion(10, 20,15));
		System.out.println();
		list.iterate();
	}
}
