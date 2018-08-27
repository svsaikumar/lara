class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();//here test method with no args is called but there is no such type  of method.so we get error
		System.out.println("main end");
	}

	public static void test(int i) // here test method is taking integer argument
	{
		System.out.println("from test");
	}
}

