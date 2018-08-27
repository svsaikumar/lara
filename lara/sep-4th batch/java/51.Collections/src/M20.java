import java.util.Vector;
import java.util.Enumeration;
class M20
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(90);
		v1.add(910);
		v1.add(190);
		v1.add(20);
		Enumeration e1 = v1.elements();
		v1.add(50);//it is adding at the right end
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
			
		}
		System.out.println(v1);
	}
}
//by using enumration also we can iterate only one time
//once cursor reaches righ end, hasMoreElements() method returns false
//we can add elements it to the vector before enumeration is got over.but it will add at the right end
//incase of ListItesrator it will add according to first index
//only iterators are failfastIterator but not Enumeration
//concurrent modifications are allowed in Enumeration


//vector is synchronized
//Arraylist - internally uses array
	//so there are some limitations for ArrayList
	// when any elemnt is inserting if shift right by one place
	//insertion operation is not very effective operation

	//arrayList is not synchr
	//in multithreading environment, don't use ArrayLIst as it is not synchrinized
	//as multiple thread are entering into ArrayLIst there may be a scope of data corruptipn
	//if frequently insertion are there then arrayList is not advisable

//these 2 are the limitaions of ArrayList(above lines)
//reading operation is very effective in ArrayLIst becues it uses array internally
//random access is very effective

//vector also internally uses arrays but it is synchronized where multi threading is not possible
//in multi thread environment use vector as it is synchronized
//vector is treated as legacy

//linked list
//list of elements with links(first is refrin to second, second is refering to third and so on......
//linked list is very effective incase of frequent insertions
//linked list is not advisable for frequent read operations because the elements location is not fixed
//elements are scattered.there is no any realation b/w address of elements inside linked list(so it is time consuming)
//it is not effective in random access
//Likedlist a list type and queue type where Araylist is a pure list type
//Array list has only list features
//linked list has both list and queue features
//under queue there are 2 classes
	//linked list
	//priority queue

//linkedlist maimly queue type
//we can access stack features also using queue(first in first out)
//all basic features of queqe and stack we can develop through linked list