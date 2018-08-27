import java.util.ArrayList;

class  M102
{
	public static void main(String[] args) 
	{


		ArrayList <Integer>list =  new ArrayList<Integer>();
		list.add(90);
		list.add(9.5);
		list.add("abc");
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		double d1 = (Double)list.get(1);//downcasting to double
		System.out.println(d1);
	}
}
//here in this list ,we can store only Interger type of elements
//now compiler hava claritry which type of elements has to be insertd into the ArrayList(i.e only Integer objects)