class Z10 
{
	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
		test(10,50);
		System.out.println("main end");
	}

	public static void test(int i, int i) //here the two arguments are not unique so we get error here
	{
		System.out.println("from test:" + i + "," + j);	
	}
}

//method argument can be primitive data type or derived data type
//every argument identifier should be unique(not be same)