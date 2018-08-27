class A < T >
{
	void method(T obj)
	{
	}
}
class M50
{
	static void test(A < ? extends Number> arg)
	{
		arg.method(new Byte((byte)10));
	}
} 

//we can't call a method by using arg as it is wild card type 