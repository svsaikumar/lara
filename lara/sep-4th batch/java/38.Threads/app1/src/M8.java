class M8 
{
	static Thread getThread() 
	{



		Thread t1 = new Thread()
		{
			public void start()
			{
				for(int i = 1; i < 5; i++)
				{
					System.out.println(i);
					System.out.println(i + Thread.currentThread().getName());
				}
			}
		};
		return t1;
	}
	
	public static void main(String[] args)
	{
		Thread t1 = getThread();
		//Thread t1 = M8();
		t1.start();
		for(int i = 40; i < 45; i++)
		{
			System.out.println(i);
		}
	}
}

//t1 pointing to  an object of sub class to thread
