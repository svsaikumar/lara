class Z12 
{
	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
		test(10);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("from test:" + i);	
		String i = "abc"; 
		System.out.println("from test:" + i);	
	}
}

//method argument can be primitive data type or derived data type
//every argument identifier should be unique(not be same)
// same identifier(variable) can't be used for more than for one data type