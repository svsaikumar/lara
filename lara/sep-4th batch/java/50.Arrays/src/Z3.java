import java.util.Comparator;//comparator interface is a functional interface having only one method i.e compare() method
class A 
{
	int  i, j ;
	A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()//over riding toString method of object class
	{
		return "(i= " + i + "," + "j= " + j + ")";
	}
}
class B implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		return ((A) obj1).i - ((A) obj2).i;//here we should not mention "this"(it represents B class) but want to compare A
	}
}
class C implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		return ((A) obj1).j- ((A) obj2).j;//here we should not mention "this"(it represents C class)  but want to compare A
	}
}
class Z3
{
	public static void main(String[] args) 
	{
		A[] x = {
					new A(90, 90), 
					new A(19, 10), 
					new A(91, 5), 
					new A(22, 15)
				};
		System.out.println(java.util.Arrays.toString(x));
		java.util.Arrays.sort(x,new B());//mentioning on which basis comparator the sortng has to done(here it is based on B)-calling compare method
		System.out.println(java.util.Arrays.toString(x));
		//first arg is array type, second argument is comparator
		//taking 2 elements from array and compare method is calling on  comparator type of objects
		
		java.util.Arrays.sort(x, new C());//mentioning on which basis comparator the sortng has to done(here it is based on C)--calling compare method
		System.out.println(java.util.Arrays.toString(x));
	}
}
//comparator is also a another interface(it is a functional interface)
//we can develop any number of comparators(one comparator for one attribute)
//Comparator contains "compare" method
//we have to provide on which basis we have to compare
//we sortng based on the difference

//taking 2 elements from array and compare method is calling on  comparator type of objects
//use compre() when we need to compare more than one attribute.compare method is uisng interally from B object
//use compareTo() when we need to compare one attribute