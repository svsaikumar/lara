class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();//void can't be converted into int.so we get error here
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("from test");
	}
}