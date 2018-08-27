import java.util.TreeSet;
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
class M50
{
	public static void main(String[] args) 
	{
		TreeSet set= new TreeSet();
		set.add(new A(90));
		set.add(new A(0));
		set.add(new A(10));
		set.add(new A(900));
		set.add(new A(190));
		set.add(new A(920));
		System.out.println(set);
	}
}
//Treeset has autosortring like PriorityQueue.so elements should be of sama type while adding
//we can't add multiple type of elements in Treeset(we will get ClassCastException)


//for sorting 3 conditions has to follow
	//every element should be of sama type
	//no element can be null(we will get nullPointerExceptipon)-internally it calls compareTo() method
	//elements should be comparable or we should supply  comparator through a separate class