class M9 
{
	static Thread getThread() 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i = 5; i < 10; i++)
				{
					System.out.println(i);
					System.out.println(i + Thread.currentThread().getName());
				}
			}
		};
		return t1;
	}
	/*public void run1()
	{
		for(int i = 100; i < 105; i++)
		{
			System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}
	Thread t2 = new Thread();
	t2.run1();
	*/

	public static void main(String[] args)
	{
		for(int i = 1; i <= 3; i++)
		{
			getThread().start();
		}
		Thread t1 = getThread();
		t1.start();
		System.out.println("dbakjfa");
		for(int i = 40; i < 45; i++)
		{
			System.out.println(i);
		}
	}
}

//t1 pointing to  an object of sub class to thread
