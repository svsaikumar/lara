import java.util.ArrayList;
import java.util.ListIterator;
class M14
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);//90,10,40,80
		ListIterator it = list.listIterator();
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			if(obj.equals(40))
			{
				it.add(50);
			}
			System.out.println(obj);
		}
		System.out.println(list);	
	}
}