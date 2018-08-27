class A extends Thread
{





	public void run()
	{
		System.out.println("run begin");
		synchronized(this)
		{
			try
			{
				wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("run end");
	}
}
class  M8
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		Util.sleep(5000);
		System.out.println("1:" + a1.getState());

	}
}

//even join method also brings the thread to waiting state

