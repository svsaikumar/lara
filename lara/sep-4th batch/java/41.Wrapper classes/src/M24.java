class M24 
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}

	static void test1(Number obj)//test1 got over loaded
	{
		System.out.println("test1(Number)");
	}

	
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);
		System.out.println("done");
	}
}
//first preferecnce going to similar wrapper one and next to wider one