import java.util.HashSet;
class M36
{
	public static void main(String[] args) 
	{


		HashSet set= new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90.0));
		System.out.println(set.add("90"));
		System.out.println(set.size());
		System.out.println(set);
	}
}
//we can add any type of elements into the "HashSet".But insertion order is not preserved
//equals() methd using 'instanceof' internally becuse of different type of objects