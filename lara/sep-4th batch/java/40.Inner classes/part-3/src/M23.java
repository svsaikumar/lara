class M23 
{
	static D method1()
	{



		return new D()
		{
			public void test1()
			{
				System.out.println("from test-1");
			}
			public void test2()
			{
				System.out.println("from test-2");
			}
		};
	}
	public static void main(String[] args) 
	{
		D obj = method1();
		obj.test1();//new D().test1();
		obj.test2();//new D().test2();
		System.out.println("done");
	}
}
//in the return statemetn we are developing subclass  to D which is concrete by implemnting concrete metnods and returning objects