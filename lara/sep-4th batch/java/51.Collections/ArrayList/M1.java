//package collections;

import java.util.ArrayList;
import java.util.Iterator;
class M1
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);//Boxing from "int" into "Integer" object(upcasting to Object)
		list.add(10);
		list.add(40);
		list.add(80);//90,10,40,80
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list);
	}
}
//we are getting the output in order in which we gave
//collections is only for derived, it won't accept primitive'
//if we give primitive, compiler automatically converts to derived(auto boxing)
//add method argument is object type

//hasNext() is a abstract method in "Iterator interface" whose return type is "boolean"
//while calling "list.Iterator" internally calling to developing one anonymous inner class.creatin an obj to that and 
//returning same object 
//Iterator is a point to ArrayList
//Iterator doesn't have elements of ArrayList
//Iterator is not a container
//while calling "it.hasNext()" it checks elements are there in the ArrayLIst or not
//hasnext() is reading the element in the ArrayList
//as long as elements are there hasNext() returns true
//next() also a abstract method in Iterator interface whose return type is "element type"