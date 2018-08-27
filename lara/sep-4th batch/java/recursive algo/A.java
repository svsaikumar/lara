class A  
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("------------");
		test();
		System.out.println("------------");
		System.out.println("main end");
	}

	public static void test()//here we are calling test method
	{
		System.out.println("from test");
	}
}
