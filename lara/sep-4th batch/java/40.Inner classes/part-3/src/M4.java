class M4 
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
		};
		a1.test1();
		a1.test2();
		System.out.println("done");
	}
}
//any class designed by making subclass to A
//a1 pointig to an object of subclass to A.inside that object test1 and test2 got overrided
//for anonymous inner class we can't develop more than one object as it didn't have a name to create on object
//anonymous inner class is for only one object
//incase of anonymous inner class, if there is develping any new methods they can't be used outside