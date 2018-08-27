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
class  M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();

		A a2 = new A()//anonymous inner class(a new class in main method)
		{

			void test2()//overriding only test2
			{
				System.out.println("AIC.test-2");
			}
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
//a2 pointing to an object  to subclass of A where only test2 is overrided
//every method of A is available in anonymous inner class