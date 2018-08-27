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
			first = last = element;
		}
		else
		{
			last.ref = element;
			last = element;
		}
	}
	boolean set(int data, int newData)
	{
		Node current = first;
		boolean status = false;
		while(current != null)
		{
			if(current.i == data)
			{
				current.i = newData;
				status = true;
				break;
			}
			current = current.ref;
		}
		return status;
	}
	boolean insert(int data1, int data2, int newData)
	{
		Node current = first;
		boolean status = false;
		while(current != null)
		{
			if((current.ref != null) && (current.i == data1 && current.ref.i == data2))
			{
				Node element = new Node(newData);
				element.ref = current.ref;
				current.ref = element;
				status = true;
			}
			current = current.ref;
		}
		return status;
	}
	void swap(int data1, int data2)
	{
		Node n1Prev,n1,n1Next,n2Prev,n2,n2Next;
		n1Prev = n1 = n1Next = n2Prev = n2 = n2Next = null;
		Node current  = first;
		while(current != null)
		{	
			if(current.i == data1)
			{
				n1 = current;
				n1Next = current.ref;
				break;
			}
			n1Prev = current;
			current = current.ref;
		}
		current = first;
		while(current != null)
		{	
			if(current.i == data2)
			{
				n2 = current;
				n2Next = current.ref;
				break;
			}
			n2Prev = current;
			current = current.ref;
		}
		if(first.i == data1)
		{
			
			first = n2;
			n2.ref = n1Next;
			n2Prev.ref = n1;
			n1.ref = n2Next;
		}
		else if(last.i == data2)
		{
			
			n1Prev.ref = n2;
			n2.ref = n1Next;
			n2Prev.ref = n1;
			n1.ref = null;
		}
		else if(n1.ref == n2)
		{
			
			n2.ref = n1;
			n1.ref = n2Next;
		}
		else
		{
			
			n1Prev.ref = n2;
			n2.ref = n1Next;
			n2Prev.ref = n1;
			n1.ref = n2Next;
		}
	}
	void iterate()
	{
		Node current = first;
		while(current != null)
		{
			System.out.print(current.i+", ");
			current = current.ref;
		}

	}
}
class Z2
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
		
		//list.swap(40,50);
		//list.swap(10,90);
	//	list.set(50,150);
		list.insert(50,60,55);
		System.out.println("-------------");
		list.iterate();
	}
}
