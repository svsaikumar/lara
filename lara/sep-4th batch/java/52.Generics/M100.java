import java.util.ArrayList;
class  M100
{
	public static void main(String[] args) 
	{


		ArrayList list =  new ArrayList();
		list.add(90);//90(int) upcastuing to Object type
		list.add(9.5);//9.5(double) upcastuing to Object type
		list.add("abc");//"abc"(String) upcastuing to Object type
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		double d1 = (Double)list.get(2);
		System.out.println(d1);
	}
}
//add() method arguement is object type
//String can be upcasted to Object type
//compiler is unable cheking whether, the elements we are inserting are eligible to insert into ArrayList or not
//because add() return type is Object type
//here there is no type checking method