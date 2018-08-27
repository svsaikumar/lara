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
class  M5
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();

		A a2 = new A()//anonymous inner class(a new class in main method)
		{

			void test1()//overriding only test1.here test1 is inherited method
			{
				System.out.println("AIC.test-1");
			}
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
//