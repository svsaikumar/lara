class Node
{
	int i;
	Node ref;
	Node(int i)
	{
		this.i=i;
	}
}
class LinkedList
{
	Node first;//reading
	Node last;//adding
    void add(int i)
	{
		Node element=new Node(i);
		if(first == null)
		{
			first=element;
		}
		else
		{
           last.ref=element;
	    }
		last=element;
	}
   void iterate()
	{
		Node current=first;
		while(current != null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
	}
    boolean remove(int data)
	{
	 boolean status=false;
		if(first.i==data)
		{
			first=first.ref;
			 status=true;                       //for removing 1st element
		}
		else if(last.i==data)
		{
			Node prev=null;    //removing last element
			Node current=first;
			while(current.ref != null)
			{
                prev=current;
				current=current.ref;
			}
			last=prev;
			last.ref=null;
			status=true;
		}
		else
		{
			Node prev=null;
			Node current=first;
			while(current != null && !(status =!(current.i !=data)))
			{
				prev=current;            //removing middle elements
				current=current.ref;
  			}
			if(status)
			{
				prev.ref=current.ref;
			}
		}
		return status;
	}
	boolean set(int data,int newData)
	{
		Node current=first;
		boolean status=false;
		while(current != null)
		{
			if(current.i==data)
			{
                current.i=newData;
				status=true;
				break;
			}
			current=current.ref;
		}
		return status;
	}
	boolean insert(int data1,int data2,int newData)
	{
		boolean status=false;
		Node prev=first,current=first;
		while(current!=null)
		{
			if(prev.i==data1 && current.i==data2)
			{
				status=true;
				Node newNode=new Node(newData );
				prev.ref=newNode;
				newNode.ref=current;
				break;
			}
	   
		}
		return status;
	}
}
class M13
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();//first,last=null
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.iterate();
		System.out.println("------------");
		//System.out.println(list.remove(40));
		System.out.println(list.set(40,100));
		//list.remove(60);
		//list.remove(30);
		list.iterate();
	}
}
/*output:
20
30
40
50
60
--------
true
20
30
100
50
60*/