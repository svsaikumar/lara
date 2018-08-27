class M11 
{
	static void test(Thread t1)
	{
		t1.start();
	}


	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i = 0; i < 10; i++)
				{
					System.out.println(i);
					System.out.println(i + Thread.currentThread().getName());
				}
			}
		};
		test(t1);
		for(int i = 0; i < 11; i++)
		{
			System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}
