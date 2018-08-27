import java.util.TreeSet;
import java.util.Comparator;
class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
}
class M55
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet(

						(obj1, obj2) ->  ((A)obj1).i - ((A)obj2).i);

		set.add(new A(90));
		set.add(new A(0));
		set.add(new A(10));
		set.add(new A(900));
		set.add(new A(190));
		set.add(new A(920));
		System.out.println(set);
	}
}
//collection api means mainly sorting and avoiding duplicates
//set is having navigable feature also
