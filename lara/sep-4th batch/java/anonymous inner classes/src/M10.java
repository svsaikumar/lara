abstract class B
{
	abstract void test1();
	void test2()
	{
		System.out.println("from B.test2()");
	}
} 
class M10
{
	public static void main(String[] args) 
	{
		B b1 = new B()
		{
			void test1()
			{
				System.out.println("from AIC.test1()");
			}
		};
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}
