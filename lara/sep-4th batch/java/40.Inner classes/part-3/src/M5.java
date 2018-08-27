class M5 
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
			}

			void test3()
			{					
				System.out.println("AIC.test-3()");
			}
			test3();

		};
		a1.test1();
		a1.test2();
		//a1.test3();//test3 is not available in class A
		System.out.println("done");
	}
}
//we can't use newly created methods in an inner class outside of that inner class
//a1 type is class A.test 3 is not available in class A.so we get error here