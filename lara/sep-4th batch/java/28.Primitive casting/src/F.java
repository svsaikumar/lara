class F 
{
	static int test()
	{
		return 100;
	}
	public static void main(String[] args) 
	{
		int i = test();//int i = (int) test();
		long lon = test();//long lon = (long) test();
		float f1 = test();//flaot f1 = (float) test();
		double d1 = test();//explicit widening is not required.it is autokmatically done by the compiler
		System.out.println("done");
	}
}
