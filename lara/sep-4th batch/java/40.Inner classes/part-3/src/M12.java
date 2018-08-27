class M12 
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			 
			void test1()//overriding test-1 of C
			{
				System.out.println("from AIC.test-1()");
			}
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
//in this anonymous inner class , we can override any concrete methods of class C