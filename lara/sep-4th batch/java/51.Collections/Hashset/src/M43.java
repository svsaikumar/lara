import java.util.HashSet;
import java.util.Iterator;
class  M43
{
	public static void main(String[] args) 
	{

		HashSet set= new HashSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(set);
	}
}
//we can iterate all the elements through the iterator
//under "setStream" if we want order then we have to use "linkedHashset"