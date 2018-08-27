class Z1 
{
	enum C
	{
		T1, T2, T3, T4, T5;

			void test()//non-static method
			{
				System.out.println("from test");
			}
	}

	public static void main(String[] args) 
	{
		C c1 = C.T3;
		c1.test();
		System.out.println("------------");

		C c2 = C.T4;
		c2.test();
		System.out.println("------------");
	}
}
//while T1 is loading test is loading 
//while T2 is loading test is loading 
//while T3 is loading test is loading  
