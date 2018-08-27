class M26 
{
	static void test(int ... args)
	{
		System.out.println("var arg");
	}

	public static void main(String[] args) 
	{
		test();
		test(10);
		test(20, 4);
		test(40, 10);
		System.out.println("done");
	}
}
//in JDK1.5 var args got introduced
//here the data type for test method argument is int, and we can supply any number of integer arguements