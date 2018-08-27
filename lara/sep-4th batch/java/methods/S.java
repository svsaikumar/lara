class S 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();//ignoring return value
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
}