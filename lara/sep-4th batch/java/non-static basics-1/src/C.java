class C 
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		//C c1 = new C();
		//c1.test();
		test();
		System.out.println("main end");
	}
}
//here test method  is non static.we can't use it in static main method straight away