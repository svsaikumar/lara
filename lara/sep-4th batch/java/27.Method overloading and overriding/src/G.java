class G
{
	public static void test()
	{
		System.out.println("test()");
	}

	protected final int test()
	{
		System.out.println("test()");
		System.out.println("test()");
		System.out.println("test()");
		System.out.println("test()");
		return 20;
	}
	abstract boolean test(double i);
}
//we can't have same signature for overlaoding.so we get error here
//we can't overlaod any 2 methods having same signature by changing something else
//different signature is mandatory for overlaoding