interface A//interface with only one method is for lamda expressions
{
	void test();
}
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A()
		{//by default this inner class is subclass to A
			public void test()
			{
				System.out.println("from test");
			}
		};
		a1.test();
		System.out.println("===================");

		A a2 = () -> System.out.println("from test");
		a2.test();
	}
}
//lamda expressions are introdeced in JDK 1.8 in order to single method interfaces
//any interface without memberes is known as marker interface
//any interface with only one method is known as fuctional interface
//interface with only one method is for lamda expressions
//mainly, marker interfare are clonable and serializable
/*functional interface
	-runnable only one method
	-comparable that containing only method
	-comparator functional interface
	*/
//lambda expressions are only for functional interfaces