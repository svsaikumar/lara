import java.util.HashSet;
class M38
{
	public static void main(String[] args) 
	{


		HashSet set= new HashSet();
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.size());
		System.out.println(set);
	}
}
//inside 'StringBuffer' and "StringBuilder" class hashcode() and equals() are not overrided
//both are object class metnd , worrying about contetnt but nt on memory location
//inide 'StringBuffer' and "StringBuilder" both methods are object class methods only
//eventhough the content is samse, unable to identigfy the duplicates as methods are not overrided