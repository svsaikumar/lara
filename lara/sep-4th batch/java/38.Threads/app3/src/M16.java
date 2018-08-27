class M16 
{
	public static void main(String[] args) //throws InterruptedException
	{



		System.out.println("main begin");
		Thread t1 = new Thread( () -> {
										
											for(int i = 1; i< 10; i++)
											{
												System.out.println("child:" + i);
												try
												{
													Thread.sleep(3000);//1000 is time in milli.sec
												}
												catch (InterruptedException ex)
												{
													ex.printStackTrace();
												}
											}
										});
										t1.start();
										for(int i = 1; i< 10; i++)
										{
											System.out.println("main:" + i);
											try
											{
												Thread.sleep(3000);//1000 is time in milli.sec
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
