class Y 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double i = test();
		System.out.println("=======");
		System.out.println(test());
		System.out.println("=======");
		System.out.println(i);
		System.out.println("======== =");
		System.out.println("main begin");
	}

	public static double test() 
	{
		System.out.println("from test");
		return 12.5;
	}
}
