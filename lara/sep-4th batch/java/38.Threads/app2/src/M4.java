class M4 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread (new Runnable()//thread class constructer
								{			//subclass to runnable
									public void run()
									{								
										for(int i = 1; i < 10; i++)
										{
											System.out.println("run:" + i);
										}
									}
								});
		t1.start();
		for(int i = 1; i < 10; i++)
		{
			System.out.println("main:" + i);
		}
	}
}
//t1 pointing to object subclass to runnable
