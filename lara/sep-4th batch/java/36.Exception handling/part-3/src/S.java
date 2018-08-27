class S
{
	public static void main(String[] args) throws ClassNotFoundException//(we have to use this here) or try-catch
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}
//we get error because while callj=ing  test we have use try-catch or throws as it is throwing checked exception
