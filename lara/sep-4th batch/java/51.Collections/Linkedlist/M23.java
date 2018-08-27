import java.util.LinkedList;
class M23
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.get(list.size()-1));//reading the last element
		System.out.println(list);
	}
}
//to maintain the stack last in first out
//linked list has indexex(check it)