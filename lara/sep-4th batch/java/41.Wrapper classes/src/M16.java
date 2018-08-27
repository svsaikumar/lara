class M16 
{





	static void test(int i)
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		test(10);
		System.out.println("=============");
		Integer obj = new Integer(90);
		test(obj);// test(obj.intValue());
		System.out.println("done");
	}
}
//test method argument is primitive
//test requires primitive type , but we are supplying derived(compiler doing auto unboxing).
