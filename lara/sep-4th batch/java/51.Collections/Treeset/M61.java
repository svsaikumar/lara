import java.util.TreeSet;
import java.util.Set;
class M61
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
		Set set1 = set.tailSet(5);//here 5 is inclusive.if it is available
		Set set2 = set.tailSet(6);//here 6 is inclusive
		System.out.println(set1);
		System.out.println(set2);
	}
}
//tailSet() is opposite to headSet()
//by defalult specified element inclusive