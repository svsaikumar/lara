class A
{
	public static void test()
	{
		System.out.println("test()");
	}

	static void test(int i)//overloading-same name but different signature
	{
		System.out.println("test(int)");
	}
	private void test(int i, int j)
	{
		System.out.println("test(int, int)");
	}
	protected static void test(double i)
	{
		System.out.println("test(double)");
	}
}
//while overloading a method we can chooose any access level
//overloading methods can have any access level
//