class User1 extends Thread 
{
	private ThreadPoolManager tp = null;
	User1(ThreadPoolManager tp)//tm
	{
		this.tp = tp;
	}
	public void run()
	{
		while(true)
		{
			ModelThread mt = tp.checkOut();//first model thread
			synchronized(mt)
			{
				mt.notify();// model thread is activated
			}
			Util.sleep(10);//user thread sleep
			synchronized(mt)
			{
				try
				{
					mt.wait();//user going  into wait
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			tp.checkIn(mt);
			Util.sleep(1000);
		}
	}
}
//every model thread is in waiting only, then user is calling  notify on model thread , then it will execute
// for loop, user thread is going  to wait state after sleeping
//after for llop , model therad is callin modify on model thread, so user thread is releasing
