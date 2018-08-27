class M12 
{
	static void test(Thread t1)
	{
		t1.start();
	}
	public static void main(String[] args) 
	{
		
			test(new Thread()
			{
				public void run()
				{
					for(int i = 0; i < 10; i++)
					{
						System.out.println(i);
						System.out.println(i + Thread.currentThread().getName());
					}
				}
			});
		
		for(int i = 10; i < 20; i++)
		{
			System.out.println(i);
		}
	}
}
//in paranthesis developing a class and overdiding run method,creating a oject and considering that obejtc o call method