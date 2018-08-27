interface C
{
	void test1();
	void test2();
}
class  M14
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			public void test1()
			{
				System.out.println("AIC-test1()");
			}
			

		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
//we have to implement every method in anonymous inner class otherwise class has to be declared as abstract