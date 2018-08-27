class ModelThread extends Thread
{
	public void run()
	{
		while(true)//infinite while loop
		{
			synchronized(this)
			{
				try
				{
					wait();//model thread into wait state
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			for(int i = 0 ; i < 10; i++)//model performing 
			{
				System.out.println(getName() + ":" + i);
				Util.sleep(500);//model Thread sleeping
			}
			synchronized(this)
			{
				notify();//user is activated
				//mt.notify();
			}
		}
	}
}

