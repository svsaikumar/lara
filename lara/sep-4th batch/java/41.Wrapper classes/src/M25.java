class M25
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}

	static void test1(Object obj)//test1 got over loaded
	{
		System.out.println("test1(Object)");
	}
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);
		System.out.println("done");
	}
}
//first preferecnce going to similar wrapper one and next to wider one
//first to widening
//second preference is upcasting
