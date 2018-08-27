class M12 
{
	public static void main(String[] args) 
	{
		Thread main = Thread.currentThread();
		main.setPriority(Thread.MIN_PRIORITY);
		//Thread.MIN_PRIORITY
		//Thread.NORM_PRIORITY
		//Thread.MAX_PRIORITY
		

		Runnable r1 = () -> {
								for(int i = 1; i < 10; i++)
								{	
									System.out.println("run:" + i);//child thread executes
								}
							};
		Thread t1 = new Thread(r1);
		t1.setPriority(8);
		t1.start();
		System.out.println("done");//main thread executes
	}
}
//by default every thread is user thread(not depend on parent thread)