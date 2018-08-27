class M30 
{
	public static void test(String x, double ... y) 
	{
		System.out.println(x);
		for(double value : y)
		{
			System.out.println(value);
		}
		System.out.println("==========");
	}
	public static void main(String[] args)
	{
		
		test("abc");
		test("abc",1.5);
		test("abc",2.5, 4.5);
		test("abc",10.5, 20, 30);
		test("abc",10, 20, 30, 40);
		System.out.println("done");
	}
}
