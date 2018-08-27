import java.util.LinkedList;
class M22
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.poll());//prints the first element in the list by removing it from the list
		System.out.println(list);
	}
}
//poll() method reads and removes the head element(first elemetn) in the linked list 