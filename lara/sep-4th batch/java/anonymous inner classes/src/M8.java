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
class  M8
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
			void test1()
			{
				System.out.println("AIC.test-1");
				test3();//calling new member of an.inner class from inside that class which is legal
			}
			
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
//we can call new members of anynympus inner class from same class
//anonymous inner class always should be concrete because as we are developing it while object creation so abstract methods are not allowed
//as we shoild not crate object for abstrat methods