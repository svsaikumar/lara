import java.util.TreeSet;
import java.util.Set;
class M60
{
	public static void main(String[] args) 
	{


		TreeSet set= new TreeSet();
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(9);
		set.add(8);
		set.add(1);
		set.add(7);
		System.out.println(set);
		Set set1 = set.headSet(7, true);//here 7 is inclusive
		Set set2 = set.headSet(3, false);//here 3 is exclusive
		System.out.println(set1);
		System.out.println(set2);
	}
}
//by default second argument is false