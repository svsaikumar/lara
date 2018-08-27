class U 
{
	static void test()
	{
		System.out.println("test()");
	}
	static void test(int i)//same name,different signature-over laoding
	{
		System.out.println("test(int)");
	}
	static void test(double i)//over laoding
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		test();
		System.out.println("=======");
		test(20);
		System.out.println("=======");
		test(25.2);
		System.out.println("=======");
	}
}
