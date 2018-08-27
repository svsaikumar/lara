class E 
{
	static byte test()
	{
		return 100;
	}

	public static void main(String[] args) 
	{
		byte b1 = test();
		short s1 = test();//short s1 = (short) test();
		int i = test();//int i = (int) test();
		long lon = test();//long lon = (long) test();
		float f1 = test();//flaot f1 = (float) test();
		double d1 = test();//double d1 = (double) test();
		System.out.println("done");
	}
}
