class Z6 
{
	public static void main(String[] args) 
	{ 
		
		System.out.println("main begin");
		test(10);//there is no test method with single argument so we get errror
		System.out.println("main end");
	}

	public static void test(int i,int j) //method can have any number of arguments by using comma(,) as a separator
	{
		System.out.println("from test:" + i);
		
	}
	
}

