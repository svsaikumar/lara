class M11 
{
	public static void main(String[] args) 
	{


		C c1 = new C()
		{
			 
			void test2()
			{
				System.out.println("from AIC.test-2()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
//very instantly we are able to use abstract class
//here anonymous inner class in concrete so we can create object