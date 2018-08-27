abstract class B
{
	abstract void test1();
	void test2()
	{
		System.out.println("from B.test2()");
	}
} 
class M11
{
	public static void main(String[] args) 
	{
		B b1 = new B()
		{
			M11()
			{
				int i = 10;
				System.out.println(i);
			}

			void test1()
			{
				System.out.println("from AIC.test1()");
			}
			void test2()
			{
				System.out.println("from AIC.test2()");
			}
		};
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}
