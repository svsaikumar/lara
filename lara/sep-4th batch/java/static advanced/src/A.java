class  A
{
	static int i = 10;
	static int j = test();
	static int test()
	{
		System.out.println("from test:" + i+ "," + j);
		return 10 + i;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:" + i+ "," + j);
	}
}
//while class is loading,every static members loading into the memory
//here initially i and j are loaded with default values