class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("from test");
	}
}
//we are trying to print test method return value although there is no return value to test method as it is void
//so we get error