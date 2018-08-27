class A < T >
{
	T var;
}
class M55
{
	static void test(A < ? super Number > arg)
	{
	}
	public static void main(String[] args)
	{
		A < int > a1 = new A<int>();
		System.out.println("done");
	}
}
//primitive types are not allowed as generics
//generics is only for classes but not for primitives