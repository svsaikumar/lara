import java.util.TreeSet;
class M57
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
		System.out.println(set.ceiling(5));
		System.out.println(set.ceiling(6));//here 6 is not there, it prints the next value
		System.out.println(set.ceiling(7));
	}
}
//set is having navigable feature also
