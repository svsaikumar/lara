class M2 
{
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		A a1 = new A()
		{//anonymous inner class.this class is subclass to A.it is extending from class 
			void test1()//test1 got overrided here.A
			{					//we should not use extend keyword here
				System.out.println("AIC.test-1()");
			}
		};
		a1.test1();
		a1.test2();
		System.out.println("done");
	}
}
//designing a class without a name is called as anonymous class
//it can't be referred from another place as it didn't has a name.
//anonymous inner class should end with a semi colon
//a1 has one object which not derived from class A it is derived from subclass of A