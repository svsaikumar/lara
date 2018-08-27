class M14
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
		t1.start();
		try
		{
			t1.join();//main thread is waiting until the execution of child thread
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");//main thread executes
	}
}
//by default every thread is user thread(not depend on parent thread)
//here child thread is user thread, it is not convertimg to daemon
//asking to the parent to wait until child is completed(parent joins at the end of child)
//main has to join at the end of t1(child)
/*there are 3 method which are required to interrupt a thread
				-join()
				-sleep()
				-wait()
				*/