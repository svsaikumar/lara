class A < T >
{
	T obj;
}
class M48
{

	public static void main(String[] args) 
	{
		A < ? extends Number> a1 = new A<Integer>();
		a1.obj = 9000;
		System.out.println("done");
	}
}
//wild card extends Number.
//a1 having multiple options

//there are a lot of options to assign a value toa1
//we can't assign any value to obj by using a1