import java.util.Comparator;
class A 
{
	int  i, j ;
	A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()//over riding  toString method of object class
	{
		return "(i= " + i + "," + "j= " + j + ")";
	}
}
/*class B implements Comparator
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
}*/
class Z5
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
		java.util.Arrays.sort(x,
			(obj1,obj2) -> ((A) obj1).i - ((A) obj2).i);
		System.out.println(java.util.Arrays.toString(x));
		java.util.Arrays.sort(x, 
			(obj1,obj2) -> ((A) obj1).j - ((A) obj2).j);
		System.out.println(java.util.Arrays.toString(x));
	}
}
//every element in the array is array-two dimensinal array
//if 2 dimensional array is stored in another array, then it is 3 dimensional array
//array of arrays is 2 dimensional array