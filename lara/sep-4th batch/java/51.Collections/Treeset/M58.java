import java.util.TreeSet;
import java.util.Set;
class M58
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
		Set set1 = set.headSet(5);//5 is exclusive.specified element is exclusive if it is available
		Set set2 = set.headSet(6);//6 is exclusive
		System.out.println(set1);
		System.out.println(set2);
	}
}
//set is having navigable feature also
//by using "Set" only the all other "sets" are derivedo
//here set is a generic form
//from staring to specified element(exclusive)
