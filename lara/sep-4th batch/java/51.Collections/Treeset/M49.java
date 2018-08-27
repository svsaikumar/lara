import java.util.TreeSet;
class  M49
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(null);
		set.add(190);
		System.out.println(set);
	}
}
//Treeset has autosortring like PriorityQueue.so elements should be of sama type while adding
//we can't add multiple type of elements in Treeset(we will get ClassCastException)


//for sorting 3 conditions has to follow
	//every element should be of sama type
	//no element can be null(we will get nullPointerExceptipon)-internally it calls compareTo() method
	//