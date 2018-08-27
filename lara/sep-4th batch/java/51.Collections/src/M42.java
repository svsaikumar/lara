import java.util.HashSet;
class  M42
{
	public static void main(String[] args) 
	{

		HashSet set= new HashSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		System.out.println(set);
	}
}
//insertion order is not preserved in "HashSet"
//it is not using index internally