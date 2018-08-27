class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("========");
		int i = test();
		System.out.println("========");
		int j = i + test();
		System.out.println("========");
		int k = i + j + test() + test();
		System.out.println("========");
		System.out.println(k + test());
		System.out.println("==========");
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
}



