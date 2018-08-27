class M19 
{
	public static void main(String[] args) //throws InterruptedException
	{
		System.out.println("main begin");
		Thread t1 = new Thread( () ->	{
										
											System.out.println("child begin:" );
											Util.sleep(10000);//child thread is sleeping for 10s
											System.out.println("child end");
										}
							);		
							t1.start();
							Util.sleep(2000);//main thread is sleeping for 2s
							t1.interrupt();
							System.out.println("main end");
	}
}
//sleep is a static method
//we don't require try-catch here
//if multiple threads are sleeping then it is advisable to develop Util class
//after 2s main thread is interrupting, and child is also interrupted by main

