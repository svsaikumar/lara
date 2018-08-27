class M11
{
	static void produceThread(Runnable r1)
	{
		new Thread(r1).start();
	}
	public static void main(String[] args) 
	{
		produceThread(new Runnable()
				{
					public void run()
					{
						for(int i = 1; i < 10; i++)
						{
							System.out.println("run:" + i);
						}
					}
				});
		for(int i = 10; i < 20; i++)
		{
			System.out.println("main:" + i);
		}
	}
}
