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
class M54
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet(new Comparator()
		{
				public int compare(Object obj1, Object obj2)
				{
					return ((A)obj1).i - ((A)obj2).i;
				}
		});
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