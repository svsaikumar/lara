interface C
{
	void test1();
	void test2();
}
class  M13
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			public void test1()
			{
				System.out.println("AIC-test1()");
			}
			public void test2()
			{
				System.out.println("AIC-test2()");
			}

		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
//no abstract method is allowed inside an anonymous inner class