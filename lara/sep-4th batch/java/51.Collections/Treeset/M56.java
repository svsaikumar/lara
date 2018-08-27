import java.util.TreeSet;
class M56
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
		System.out.println(set.floor(5));
		System.out.println(set.floor(6));//here there is no 6, so it takes the lesser floor than 6
		System.out.println(set.floor(7));
	}
}
//set is having navigable feature also
