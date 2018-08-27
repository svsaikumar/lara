class A < T >
{
	void test(T obj)
	{
	}
}
class M54
{
	static void test(A < ? super Number > arg)
	{
	}
	public static void main(String[] args)
	{
		A < ? super Number > a1 = null;
		a1 = new A<Number>();
		a1.test(45.5);
		System.out.println("done");
	}
}
