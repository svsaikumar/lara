class A < T >
{
	T obj;
}
class M49
{

	static void test(A < ? extends Number> arg)
	{
		arg.obj = 10;
	}
}
//we can't justity arg.obj pointing to integer
//it can point to any subclass to Number or Number type