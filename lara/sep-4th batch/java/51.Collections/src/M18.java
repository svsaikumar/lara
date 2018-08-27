import java.util.ArrayList;
import java.util.ListIterator;
class M18
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
			System.out.println(it.previousIndex());
			obj = it.next();
			if(obj.equals(40))
			{
				it.set(50);//here 40 is replacing with 50
			}
			System.out.println(obj);
			System.out.println(it.nextIndex());
			System.out.println("======");
		}
		System.out.println(list);	
	}
}