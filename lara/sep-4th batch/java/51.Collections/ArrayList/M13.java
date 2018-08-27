import java.util.ArrayList;
import java.util.ListIterator;
class M13
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		ListIterator it = list.listIterator();
		it.add(50);
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println(list);	
	}
}
//we can add elements to ArrayLIst by uisng ListIterator eventhough Iteration is not over
//but it will add in the first index of ArrayList by shifting the all elements to next positions

/*we can't add elements into the ArrayList by using ArrayLIst add() method.
we can add by using ListIteratior add() method before iteration is got over
*/

//wherever pointer is there , there only element is adding