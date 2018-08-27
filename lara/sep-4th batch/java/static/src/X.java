class X
{
	static void test()
	{
		System.out.println("from test:" + i);
	}

	static int i = 20;
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i);
		test();
		
	}
}
//in case of global variables using in initializer only we can't go for forward reference but not incase of methods
//methods are not executing automatically.but intitalizers execute automatically
//we can call  methods from any where