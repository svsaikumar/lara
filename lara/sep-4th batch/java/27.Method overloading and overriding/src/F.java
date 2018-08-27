abstract class F
{
	public static void test()
	{
		System.out.println("test()");
	}

	final int test(int i)
	{
		System.out.println("test(int)");
		return 20;
	}
	abstract boolean test(double i);
}
//overloading- different signature and same name
//two methods with same signature can't be overloaded