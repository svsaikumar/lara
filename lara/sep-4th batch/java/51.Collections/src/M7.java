import java.util.ArrayList;
import java.util.ListIterator;
class M7
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
		System.out.println(list);	
	}
}
//ListIterator is also an interface extending to Iterator interface
//"ListIterator" contains all the methods of "Iterator" as it is extending to "Iterator"