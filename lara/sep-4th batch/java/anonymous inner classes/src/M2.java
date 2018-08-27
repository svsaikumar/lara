class A
{
	void test()
	{
		System.out.println("A.test");
	}

}
class  M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();

		A a2 = new A()
		{
			void test()
			{
				System.out.println("AIC.test");
			}
		};
		a2.test();
		System.out.println("done");
	}
}
//a1 pointing to an object of A
//a class without a name is called as anonymous inner class(we have to provide a superclass name only)
//we should not use extends keyword(but internally it is extending)
//here it is subclass to A
//there it is overriding
//obejct is created to A where it is overrided
//a2 pointing to  object of subclass to A.
