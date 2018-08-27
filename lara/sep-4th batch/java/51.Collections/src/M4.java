import java.util.ArrayList;
import java.util.Iterator;
class M4
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);//boxing from "int" into "Integer" object(upcasting to Object)
		list.add(10);
		list.add(40);
		list.add(80);//90,10,40,80
		Iterator it = list.iterator();
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println("===========");
		while(it.hasNext())//we can't read ArrayLIst using same iterator more than one time
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println(list);	
	}
}
//while using one iterator we can read ArrayList only one time
//when cursor or pointer of iterator reaches right end of the ArrayList, then it returns false