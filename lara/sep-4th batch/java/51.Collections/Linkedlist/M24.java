import java.util.Vector;
import java.util.LinkedList;
class M24
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.removeLast());//reading and removing the last element from the linked list
		System.out.println(list); 
	}
}
//removeLast() reads and removes the last element from the linked list