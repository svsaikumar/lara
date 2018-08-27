class M6 
{
	public static void main(String[] args) 
	{



		for(int i = 1; i <= 3; i++)
		{
			Thread t1 = new Thread()
			{
				public void run()
				{
					for(int i = 1; i < 5; i++)
					{
						//System.out.println(i);
						System.out.println(i + Thread.currentThread().getName());
					}
				}
			};
			t1.start();
		}
		for(int i = 5; i < 10; i++)
		{
			//System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}
