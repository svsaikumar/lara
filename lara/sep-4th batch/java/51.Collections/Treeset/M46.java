import java.util.HashSet;
import java.util.TreeSet;
class  M46
{
	public static void main(String[] args) 
	{

		HashSet set= new HashSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		System.out.println(set);

		TreeSet set1 = new TreeSet();
		set1.addAll(set);
		System.out.println(set1);
	}
}
//treeset is used for sorting purpose