class Q 
{
	static int i =1;
	
	static void test1()
	{
		System.out.println("test-1 begin:" + i);
		i = 2;
		test2();
		System.out.println("test-1 end:" + i);
	}

	static void test2()
	{
		System.out.println("test-2 begin:" + i);
		i = 3;
		System.out.println("test-2 end:" + i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main-1:" + i);
		i = 4;
		test1();
		System.out.println("main-2:" + i);
		i = 5;
		test2();
		System.out.println("main-3:" + i);
	}
}
