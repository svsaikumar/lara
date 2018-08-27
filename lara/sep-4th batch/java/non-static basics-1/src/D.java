class D 
{
	void test1()
	{
		System.out.println("from test-1");
	}
	static void test2() 
	{
		System.out.println("test-2 begin");
		test1();
		System.out.println("test-2 end");
	}
}
//we can't call a non-static method from a satic method straight away