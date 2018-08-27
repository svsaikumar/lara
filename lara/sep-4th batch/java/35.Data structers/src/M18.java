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
	void makeCircular()
	{
		if(first != null)//if first is not a null...last also not a null
		{
			last.nextRef = first;
			first.prevRef = last;
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
			current = current.nextRef;
		}
		return status;
	}
	boolean insertion(int data1, int data2, int newData)
	{
		
		Node prev = first, current = first;
		boolean status = false;
		while(current != null)
		{
			if(prev.i == data1 && current.i == data2)
			{
				status = true;
				Node newNode = new Node(newData);
				prev.nextRef = newNode;
				newNode.nextRef = current;
				current.prevRef = newNode;
				newNode.prevRef = prev;
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
class M18
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
		//list.makeCircular();
		System.out.println("-----------------");
		list.insertion(10,20,15);
		list.reverseIterate();
	}
}
/*
double linked list...
there should be a reference frm first node to second node...second to first..
every node shudh have two references...one is pointing to rightsidenode..other is pointing to leftside node...
data ,ref1,ref2
firstnode ref2 is null..last node ref1 is null..

if we make circular ,,,,,iterate mehtod wl be infinite

*/