class M17 
{
	static void test(Integer i)
	{
		System.out.println("test(Integer)");
	}

	public static void main(String[] args) 
	{
		test(10);// test(new Integer(10))
		System.out.println("=============");
		Integer obj = new Integer(90);
		System.out.println(obj);
		test(obj);// test(obj.intValue());
		System.out.println("done");
	}
}
//test method argument is Integer
//we suppose to supply referernce type which test requires(boxing)
//primitive int boxed into integertype(auto boxing)
