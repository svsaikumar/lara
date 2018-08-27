class  M20
{
	public static void main(String[] args) 
	{



		Thread t1 = new Thread( ()-> 
						{
							for(int i = 1; i < 10; i++)
							{
								System.out.println("run" + i);
							}
						});
		t1.start();
		for(int i = 10; i < 20; i++)
		{
			System.out.println("main" + i);
		}
		System.out.println("done");
	}
}
//in thread class constructer, the argument is runnable type