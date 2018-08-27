class M17 
{
	public static void main(String[] args) //throws InterruptedException
	{
		System.out.println("main begin");
		Thread t1 = new Thread( () -> {
										
											for(int i = 1; i< 10; i++)
											{
												System.out.println("child:" + i);
												Util.sleep(1000);
												
											}
										});
										t1.start();
										for(int i = 1; i< 10; i++)
										{
											System.out.println("main:" + i);
											Util.sleep(1000);
										}
		System.out.println("main end");
	}
}
//sleep is a static method
//we don't require try-catch here
//if multiple threads are sleeping then it is advisable to develop util class
