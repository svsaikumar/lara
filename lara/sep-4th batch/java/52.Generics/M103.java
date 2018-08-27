import java.util.ArrayList;

class  M103
{
	public static void main(String[] args) 
	{


		ArrayList <Integer>list =  new ArrayList<Integer>();
		list.add(90);
		list.add(9);
		list.add(300);
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		int i = list.get(2);//no need to downcast
		System.out.println(i);
	}
}
//no need to downcast as get() method returning integer objects directly