class M7 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.println(i + Thread.currentThread().getName());
			new Thread()
			{
				public void run()
				{
					for(int i = 1; i < 5; i++)
					{
						System.out.println(i);
						System.out.println(i + Thread.currentThread().getName());
					}
				}
			}.start();
		}
		for(int i = 5; i < 10; i++)
		{
			System.out.println(i);
		}	
	}
}
//as we are calling run only one time there is no need to create reference variable and call by it
