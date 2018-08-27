import java.util.ArrayList;
import java.util.Enumeration;
class M6
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);//boxing from "int" into "Integer" object(upcasting to Object)
		list.add(10);
		list.add(40);
		list.add(80);
		Enumeration it = list.iterator();
		/*Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println(list);
		list.add(50);
		System.out.println(list);
		*/
	}
}

//once iteration is got over we can add elements to the ArrayList