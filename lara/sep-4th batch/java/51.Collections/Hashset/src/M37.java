import java.util.HashSet;
class M37
{
	public static void main(String[] args) 
	{


		HashSet set= new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90.0));
		System.out.println(set.add(90.0));
		System.out.println(set.add("90"));
		System.out.println(set.add("90"));
		System.out.println(set.size());
		System.out.println(set);
	}
}
//duplicates are not added to "HashSet"(add() method returns false when we try to add duplicates to HashSet)
//in String class also hashcode() and equals() got overrided and checking the content
//in every wrapper class hashcode() and equals() got overrided