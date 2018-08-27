import java.util.TreeSet;
class  M47
{
	public static void main(String[] args) 
	{

		TreeSet set= new TreeSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		System.out.println(set);
	}
}
//treeset is used for sorting purpose
//Treeset also won't allow duplicates(we didn't get any CTE or RTE.simply it won't add into set and returns false)