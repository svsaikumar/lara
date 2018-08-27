class Z11 
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
		int i = 20;//local variable data type and method argument data type with same variable is not possible 
		System.out.println("from test:" + i);	
	}
}

//method argument can be primitive data type or derived data type
//every argument identifier should be unique(not be same)
// local variable data type and method argument data type with same variable is not possible 
//(we can abide the above condition in another method of same class