import java.util.LinkedHashSet;
class  M44
{
	public static void main(String[] args) 
	{

		LinkedHashSet set= new LinkedHashSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		set.add(190);
		System.out.println(set);
	}
}

//internally "LinkedHashSet" is maintaining linked structer
//insertion order is preserved
//order is not maintainilng thorugh index(so we can't use get() method), it is maintainingh throguh linked list structure