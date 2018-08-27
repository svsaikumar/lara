class U 
{
	int i;
	public static void test() 
	{
		U obj = new U();
		System.out.println("from test");
		System.out.println(obj.i);
		obj.i = 10;
		System.out.println(obj.i);
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
//object can be created in any method not only in main method
