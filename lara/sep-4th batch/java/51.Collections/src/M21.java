import java.util.LinkedList;
class M21
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.peek());//prints the first element in the list
		System.out.println(list);
	}
}
//the basic queue fetures we can achieve in linked list
//linkedlist has both queue and vector features
//peek() is a method in "linkedlist" class whose return type is element type
//peek() method reads the head element(first element) in the linked list