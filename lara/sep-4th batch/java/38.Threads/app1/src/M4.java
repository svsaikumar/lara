class M4 extends Thread
{
	public static void main(String[] args) 
	{



		Thread t1 = new Thread()
		{
			public void run()//overriding run method
			{
				for(int i =1; i <= 10; i++)
				{
					//System.out.println(i);
					System.out.println(i + Thread.currentThread().getName());
				}
			}
		};
		t1.start();
		for(int i = 11; i<=20; i++)
		{
			//System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}
