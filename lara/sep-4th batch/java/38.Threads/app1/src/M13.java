class M13
{
	static void test(Thread t1)
	{
		t1.start();
	}
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 3; i++)
		{
			test(new Thread()
			{
				public void run()
				{
					for(int i = 0; i < 5; i++)
					{
						System.out.println(i);
						System.out.println(i + Thread.currentThread().getName());
					}
				}
			});
		}
		for(int i = 10; i < 15; i++)
		{
			System.out.println(i);
		}
	}
}
//in paranthesis developing a class and overdiding run method,creating a oject and considering that object to call method