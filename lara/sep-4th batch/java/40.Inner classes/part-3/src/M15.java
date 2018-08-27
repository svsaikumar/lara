class M15 
{
	public static void main(String[] args) 
	{
		D d1 = new D()
		{//extending with object class implemnting to D
			
			public void test1()
			{
				System.out.println("from D.AIC-test1()");
			}

			public void test2()
			{
				System.out.println("from D.AIC-test2()");
			}
		};
		d1.test1();
		d1.test2();
		System.out.println("done");
	}
}
//here in anonymous inner class we are implementing abstract methos of D interface
//here we are not creating an object to D ,we are creating an object to subclass of D