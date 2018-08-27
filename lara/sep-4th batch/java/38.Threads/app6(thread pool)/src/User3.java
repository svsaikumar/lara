class User3 extends Thread 
{
	private ThreadPoolManager tp = null;
	User3(ThreadPoolManager tp)
	{
		this.tp = tp;
	}
	public void run() 
	{
		while(true)
		{
			ModelThread mt = tp.checkOut();
			synchronized(mt)
			{
				mt.notify();
			}
			Util.sleep(10);
			synchronized(mt)
			{
				try
				{
					mt.wait();
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
