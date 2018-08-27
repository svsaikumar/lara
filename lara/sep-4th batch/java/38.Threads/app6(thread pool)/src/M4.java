class A extends Thread
{

	A(ThreadGroup tg, String name)	
	{
		super(tg, name);
	}
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i = 10; i < 20; i++)
		{
			System.out.println(i);
		}
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("My first group");
		A a1 = new A(tg, "1st");
		A a2 = new A(tg, "2nd");
		A a3 = new A(tg, "3rd");
		
		B b1 = new B();
		Thread t1 = new Thread(tg, b1,"4th");
		Thread t2 = new Thread(tg, b1,"5th");
		Thread t3 = new Thread(tg, b1,"6th");

		a1.start();
		a2.start();
		a3.start();

		t1.start();
		t2.start();
		t3.start();
		
		//Util.sleep(1);
		tg.stop();//all 6 threads are stopped
	}
}
//for all threads we are supplyig tg reference variable of thread group
//6 threads under one group
