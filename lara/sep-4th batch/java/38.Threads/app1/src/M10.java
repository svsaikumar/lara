class M10
{
	static Thread getThread() 
	{
		return new Thread()
		{
			public void run()
			{
				for(int i = 1; i < 5; i++)
				{
					System.out.println(i);
					System.out.println(i + Thread.currentThread().getName());
				}
			}
		};
	}
	public static void main(String[] args)
	{
		for(int i = 1; i <= 3; i++)
		{
			getThread().start();
		}
		Thread t1 = getThread();
		t1.start();
		for(int i = 40; i < 45; i++)
		{
			System.out.println(i);
		}
	}
}

//t1 pointing to  an object of sub class to thread
