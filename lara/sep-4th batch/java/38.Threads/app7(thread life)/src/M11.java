class A extends Thread
{
	public void run() 
	{


		try
		{
			Thread.sleep(5000);
		}
		catch (Exception ex)
		{
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}

class M11 
{
	public static void main(String[] args) throws Exception
	{
		M11  m = new M11();
		A a1 = new A();
		a1.start();
		a1.join();
		for(int i = 10; i < 20; i++)
		{
			System.out.println(i);
			System.out.println(Thread.currentThread().getState());
		}
		
		System.out.println("done");
	}
}
