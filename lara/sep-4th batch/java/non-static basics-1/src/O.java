class O
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O();
		o1.test();
		System.out.println("==========");
		o1.test();
		System.out.println("==========");
		System.out.println("main end");
	}
}
