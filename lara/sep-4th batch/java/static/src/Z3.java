class Z3 
{
	static int i = test1();
	static int j = test1() + test2();
	static int k = test1() + test2() + test3();

	static int test1()
	{
		System.out.println("test-1:" + i + "," + j + "," + k);
		return i + j + k + test2() + test3();
	}

	static int test2()
	{
		System.out.println("test-2:" + i + "," + j + "," + k);
		return i + j + k + test3();
	}

	static int test3()
	{
		System.out.println("test-3:" + i + "," + j + "," + k);
		return 3*(i + j + k) + 10;
	}



	public static void main(String[] args) 
	{
		System.out.println("main:" + i +"," + j + "," + k);
		System.out.println("=====================");
		System.out.println(test1());
		System.out.println("=====================");
		System.out.println(test2() + test1());
		System.out.println("=====================");
		System.out.println(test3() + test2() + test1());
	}
}
