class M3 
{





	public static void main(String[] args) 
	{
		A a1 = new A()
		{//anonymous inner class.this class is subclass to A.it is extending from class A
			void test2()//test2 got overrided here.
			{					//we should not use extend keyword here
				System.out.println("AIC.test-2()");
			}
		};
		a1.test1();
		a1.test2();
		System.out.println("done");
	}
}