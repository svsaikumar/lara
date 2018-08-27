import java.util.ArrayList;
import java.util.Iterator;
class M5
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);//boxing from "int" into "Integer" object(upcasting to Object)
		list.add(10);
		list.add(40);
		list.add(80);
		Iterator it = list.iterator();
		list.add(50);//90,10,40,80,90
		//it = list.iterator(); //this is correct
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println(list);	
	}
}
//50 added after getting iterator.here 50 is not reading by the iterator.we will get concurrentmodification exception
//failfastiterator won't allow concurrent modifications
//read the element in the ArrayList throgh itarator once complete adding is got over
//after getting iterator it reads all the elemen added at that time