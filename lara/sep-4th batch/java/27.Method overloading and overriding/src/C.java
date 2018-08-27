class C
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
	boolean test(double i)
	{
		System.out.println("test(double)");
		return true;
	}
}
//overloaded methods can be static or non static or both
//over loaded methods can have any return type
//all overloaded methods doesn't required to be same return type.we can go for same return type or different type
//here test method overloaded 3 times