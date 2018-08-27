class A
{
	
	void test1()
	{
		System.out.println("A.test-1");
	}
	void test2()
	{
		System.out.println("A.test-2");
	}
}
class  M7
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();

		A a2 = new A()
		{
			void test3()//this is not overrided method.it is new method
			{
				System.out.println("AIC.test-3");
			}
			
		};
		a2.test1();
		a2.test2();
		a2.test3();
		System.out.println("done");
	}
}
//we get error as we can't use anonymous new members can't be used outside of anonomuyous inner class