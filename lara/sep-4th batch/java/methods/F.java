class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("=========");
		test();
		System.out.println("=========");
		test();
		System.out.println("main end");
		
	}
	public static void test()//defining a method
	{
		System.out.println("from test 1");
		System.out.println("from test 2");
		System.out.println("from test 3");
	}
}
//a method can any number of statements, any type of statements