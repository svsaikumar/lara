class M31 
{
	public static void test(double ... y, String x) 
	{
		System.out.println(x);
		for(double value : y)
		{
			System.out.println(value);
		}
		System.out.println("==========");
	}
}
//here we get CTE because var-arg should be last argument
//there should be only one var-arg in the argument list