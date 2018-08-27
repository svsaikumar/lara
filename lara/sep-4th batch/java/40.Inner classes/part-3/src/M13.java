class M13 
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			 
			void test1();
			{
				System.out.println("from AIC.test-1()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
//anonymous inner class can't be abstract because 
//here we are attempting to crate an object to anonymous inner class
//because test2 is not implemented in anonymous which is subclass to Class C by default