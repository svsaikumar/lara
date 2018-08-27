import java.util.ArrayList;
import java.util.Iterator;
class M3
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);//boxing from "int" into "Integer" object(upcasting to Object)
		list.add(10);
		list.add(40);
		list.add(80);
		Iterator it = list.iterator();
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
			if(obj.equals(40))
			{
				it.remove();
			}
		}
		System.out.println(list);
	}
}
//here removing the specific element but not every element which is read by hasNext()
//removing is happening from the ArrayList only