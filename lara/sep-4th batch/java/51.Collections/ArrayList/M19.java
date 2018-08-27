import java.util.Vector;
import java.util.Enumeration;
import java.util.*;
class M19
{
	public static void main(String[] args) 
	{
		ArrayList v1 = new ArrayList();
		v1.add(90);
		v1.add(910);
		v1.add(190);
		v1.add(20);
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		System.out.println(v1);
	}
}
//enumeration is a interface
/*it has 2 only methods- hasMoreElements()
					-nextElements()

					*/
// we can do only reading operation.any other is not possible