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
	void makeCircular()
	{
		if(last != null)
		{
			last.ref = first;
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
		boolean status = false;
		Node prev = first, current = first;
		while(current != null)
		{
			if(prev.i == data1 && current.i == data2)
			{
				status = true;
				Node newNode = new Node(newData);
				prev.ref = newNode;
				newNode.ref = current;
				break;
			}
			prev = current;
			current = current.ref;
		}
		return status;
	}
	void swap(int data1, int data2)
	{
		Node n1, n1Next, n1Prev, n2, n2Next, n2Prev;
		n1 = n1Next = n2 = n2Next = n1Prev = n2Prev = null;
		Node current = first;
		if(first.i == data2 || last.i == data1)
		{
			data2 = data1 + data2;
			data1 = data2 - data1;
			data2 = data2 - data1;
		}
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
		if(n1 == null || n2 == null)
		{
			return;
		}
		if(first.i == data1)
		{
			if(n1.ref == n2)
			{
				first = n2;
				n2.ref = n1;
				n1.ref = n2Next;
			}
			else
			{
				first = n2;
				n2.ref = n1Next;
				n2Prev.ref = n1;
				n1.ref = n2Next;
			}
		}
		else if(last.i == data2)
		{
			if(n1.ref == n2)
			{
				n1Prev.ref = n2;
				n2.ref = n1;
				last = n1;
				n1.ref = null;
			}
			else
			{
				n1Prev.ref = n2;
				n2.ref = n1Next;
				n2Prev.ref = n1;
				last = n1;
				n1.ref = null;
			}
		}
		else if(first.i == data1 && last.i == data2)
		{
			first = n2;
			n2.ref = n1Next;
			last = n1;
			n2Prev.ref = n1;
			n1.ref = null;
		}
		else if(n1.ref == n2)
		{
			n1Prev.ref = n2;
			n2.ref = n1;
			n1.ref = n2Next;
		}
		else if(n2.ref == n1)
		{
			n2Prev.ref = n1;
			n1.ref = n2;
			n2.ref = n1Next;
		}
		else
		{
			n1Prev.ref = n2;
			n2.ref = n1Next;
			n2Prev.ref = n1;
			n1.ref = n2Next;
		}
	}
}
class M16
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
		list.makeCircular();
		System.out.println("--------");
		//System.out.println(list.remove(20));
		//System.out.println(list.remove(50));
		//System.out.println(list.remove(30));
		//System.out.println(list.remove(130));
		//System.out.println(list.set(40, 100));
		//System.out.println(list.set(60, 100));
		//System.out.println(list.insert(20, 30, 25));
		//System.out.println(list.insert(20, 40, 25));
		list.iterate();
		//list.swap(50, 70);
		//list.swap(60, 70);
		//list.swap(10, 50);
		//list.swap(40, 90);
		//list.swap(10, 90);
		//list.swap(90, 10);
		//list.swap(90, 30);
		//list.swap(50, 10);
		//list.swap(50, 40);
		//list.swap(10, 20);
		//list.swap(80, 90);
		//list.swap(85, 90);
		System.out.println("--------");
		list.iterate();
	}
}
