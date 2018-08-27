class Z5 
{
	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
		test(10);
		System.out.println("main end");
	}

	public static void test(int i) //here i is local to test method.we can't use outside test method
	{
		System.out.println("from test:" + i);
	}
}
//method arg are local to the same method

