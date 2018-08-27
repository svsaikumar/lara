import java.util.ArrayList;
import java.util.ListIterator;
class M11
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
		System.out.println(list);	
	}
}
//inaddition to methods of Iterator , ListIterator has some other methods
/*by using listIterator we can read the read the elements in reverse direction from ArrayList ---
	once Iterating from forward direction is got over(when pointer is at the right end)
	*/
//using ListIterator we can read ArrayList any number of times(but by using Itearatoer we can read only one time)