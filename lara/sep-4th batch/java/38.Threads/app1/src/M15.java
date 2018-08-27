class M15
{
	public static void main(String[] args) 
	{


		Thread t1 = new Thread()
		{
			public void run()//main method only executing run method
			{
				for(int i = 10; i<= 20; i++)
				{
					//System.out.println(i);
					System.out.println(i + Thread.currentThread().getName());
				}
			}
		};
		t1.run();
		for(int i = 40; i<= 50; i++)
		{
			System.out.println(i);
		} 
	}
}
