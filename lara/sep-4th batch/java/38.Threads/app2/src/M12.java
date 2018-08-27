interface A
{
	void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from B.test");
	}
}
class M12
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			public void test()
			{
				System.out.println("AIC.test()");
			}
		};

		A a2 = () -> System.out.println("lambda.test()");

		B b1 = new B();
		b1.test();
		a1.test();
		a2.test();
		System.out.println("done");
	}
}
//lambda expressiond is only for single method interfaces(functional interfaces)
//compiler only developing anonymous inner class.designing an object