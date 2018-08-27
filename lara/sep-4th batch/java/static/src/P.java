class P 
{
	static int i =1;
	
	static void test()
	{

		System.out.println("test:" + i);
		i = 3;
	}
	public static void main(String[] args) 
	{
		System.out.println("main-1:" + i);
		i = 2;
		test();
		System.out.println("main-2:" + i);
	}
}
