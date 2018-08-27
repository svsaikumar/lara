class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{//anonymous inner class.this class is subclass to A.it is extending from class A
			void test1()//test1 got overrided here.
			{					//we should not use extend keyword here
				System.out.println("AIC.test-1()");
			}

			void test2()//test2 got overrided here.
			{					
				System.out.println("AIC.test-2()");
				test3();
			}

			void test3()
			{					
				System.out.println("AIC.test-3()");
			}
		};
		a1.test1();
		a1.test2();
		//a1.test3();
		System.out.println("done");
	}
}
//here we can call the new method of an inner call from inside that inner class
//new methods on aninner class can't be used from outside