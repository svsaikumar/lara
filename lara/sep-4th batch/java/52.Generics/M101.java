import java.util.ArrayList;

@SuppressWarnings("unchecked")//ignoring the unchecked type of warnings
class  M101
{
	public static void main(String[] args) 
	{


		ArrayList list =  new ArrayList();
		list.add(90);//90(int) upcasting to Object type
		list.add(9.5);//9.5(double) upcasting to Object type
		list.add("abc");//"abc"(String) upcasting to Object type
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		double d1 = (Double)list.get(1);
		System.out.println(d1);
	}
}
//ArrayList allows any type of element