class M13
{
	public static void main(String[] args) 
	{



		Runnable r1 = () -> {
								for(int i = 1; i < 10; i++)
								{	
									System.out.println("run:" + i);//child thread executes
								}
							};
		Thread t1 = new Thread(r1);
		t1.setDaemon(true);
		t1.start();
		System.out.println("done");//main thread executes
	}
}
//by default every thread is user thread(not depend on parent thread)
//Daemon should be after start
//we converted child as daemon-whenever parent is leaving, child also leaving