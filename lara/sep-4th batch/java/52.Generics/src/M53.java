class A < T >
{
	T obj;
}
class M53
{
	static void test(A < ? super Number > arg)
	{
	}
	public static void main(String[] args)
	{
		A < ? super Number > a1 = null;
		a1 = new A<Number>();
		a1.obj = 10;
		System.out.println("done");
	}
}
//Obj can be assigned to Object or Number