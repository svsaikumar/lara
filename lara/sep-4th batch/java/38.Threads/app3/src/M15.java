class M15 
{
	public static void main(String[] args) //throws InterruptedException
	{




		System.out.println("main begin");
		for(int i = 1; i< 10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(3000);//in milli.sec
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
//sleep is a static method
//
