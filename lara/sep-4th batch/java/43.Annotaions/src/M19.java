import java.util.ArrayList;

@SuppressWarnings({"unchecked", "deprecation"})
class M19 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(90);
		list.add(90);
		System.out.println(list);
		Thread t1 = new Thread();
		t1.stop();
	}
}
//add() method is a unchecked operation