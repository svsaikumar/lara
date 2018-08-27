class M23 
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}

	static void test1(Byte obj)//test1 got over loaded
	{
		System.out.println("test1(Byte)");
	}

	static void test1(double obj)//test1 got over loaded
	{
		System.out.println("test1(double)");
	}

	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);//test1(new double(b1));
		System.out.println("done");
	}
}
//auto-widening
//boxing
//var-arg