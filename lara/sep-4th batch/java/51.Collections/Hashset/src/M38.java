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
//both are object class methods , worrying about contetnt but not on memory location
//inide 'StringBuffer' and "StringBuilder" both methods are object class methods only
//eventhough the content is same, unable to identify the duplicates as equals() and hashcode() methods are not overrided