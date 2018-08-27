import java.util.ArrayList;
import java.util.Iterator;
class M2
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);//boxing from "int" into "Integer" object(upcasting to Object)
		list.add(10);
		list.add(40);
		list.add(80);//90,10,40,80
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//it prints the element which hasNext() is reading and returning true
			it.remove();//after reading every element by hasNext() and printing by next() we are removing it from the Arraylist
		}
		System.out.println(list);
	}
}
//remove() is a method in Iterator interface whose return type is "void"(it is not absract)