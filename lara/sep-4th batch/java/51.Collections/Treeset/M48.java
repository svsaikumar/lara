import java.util.TreeSet;
class  M48
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(9.00);
		set.add(190);
		System.out.println(set);
	}
}
//Treeset has autosortring like PriorityQueue.so elements should be of sama type while adding
//we can't add multiple type of elements in Treeset(we will get ClassCastException)


//for sorting
//every element should be of sama type
//