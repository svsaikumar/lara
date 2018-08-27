class A < T >
{
	void method(T obj)
	{
	}
}
class M52
{
	static void test(A < ? super Number > arg)
	{
	}
	public static void main(String[] args)
	{
		test(new A<Number>());
		test(new A<Object>());
		test(new A<Integer>());//error
		test(new A<String>());//error
		System.out.println("done");
	}
}