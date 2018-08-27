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
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.ref = element;
		}
		last = element;
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
	boolean remove(int data)
	{
		boolean status = false;
		if(first.i == data)
		{
			first = first.ref;
			status = true;
		}
		else if(last.i == data)
		{
			Node prev= null;
			Node current = first;
			while(current.ref != null)
			{
				prev = current;
				current = current.ref;
			}
			last = prev;
			last.ref = null;
			status = true;
		}
		else
		{
			Node prev= null;
			Node current = first;
			while(current != null && !(status = !(current.i != data)))
			{
				prev = current;
				current = current.ref;
			}
			if(status)
			{
				prev.ref = current.ref;
			}
		}
		return status;
	}
}
class M12
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.iterate();
		System.out.println("--------");
		//System.out.println(list.remove(20));
		//System.out.println(list.remove(50));
		//System.out.println(list.remove(30));
		System.out.println(list.remove(130));
		list.iterate();
	}
}
