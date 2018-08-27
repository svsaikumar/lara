import java.util.ArrayList;
import java.util.ListIterator;
class M12
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		ListIterator it = list.listIterator();
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println("===============");
		while(it.hasPrevious())
		{
			obj = it.previous();
			System.out.println(obj);
		}
		System.out.println("===============");
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println(list);	
	}
}
//we can read from alternative order
//that is from left to right and left to right
//left to right and again left to right is not possible
//right to left and again right to left is not possible
//one should be forward direction and next should be in reverse direction or vive versa
