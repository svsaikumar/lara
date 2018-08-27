interface A
{
	void test();
}
class M13
{
	public static void main(String[] args) 
	{
		

		A a1 = () ->	{
							System.out.println("lambda.test()");
							System.out.println("lambda.test()");
							System.out.println("lambda.test()");
							System.out.println("lambda.test()");
						};

		a1.test();
		System.out.println("done");
	}
}
//lambda expressions is for single method interfaces(functional interfaces)
//compiler only developing anonymous inner class.designing an object
//a1 poinitng to subclass to A