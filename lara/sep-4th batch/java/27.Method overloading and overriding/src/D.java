abstract class D
{
	public static void test()
	{
		System.out.println("test()");
	}
	int test(int i)
	{
		System.out.println("test(int)");
		return 20;
	}
	abstract boolean test(double i);
}
//overloading can be done for abstract method also
//while overlaoding ignore about return type, access level, static or non-static, abstract.we can overload anyone.