class A
{
	int  i =10;
	A(int i)
	{
		this.i = i;
	}
	public String toString()//over riding Object class toString method
	{
		return "i= " + i;//return type of toString() method is String type
		//we are returning String concat with a number
	}
}
class X
{
	public static void main(String[] args) 
	{
		A[] x = {
					new A(9), 
					new A(19), 
					new A(91), 
					new A(92)
				};
		System.out.println(java.util.Arrays.toString(x));//internally it is calling toStirng()  of object class on every element
	}
}
//toString() method is overrided
//we are getting the content of the object as toString method is overrided