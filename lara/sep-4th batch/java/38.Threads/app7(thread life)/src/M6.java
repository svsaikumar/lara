class A extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}
class  M6
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("1:" + a1.getState());
		a1.start();
		System.out.println("2:" + a1.getState());
		Util.sleep(100);
		System.out.println("3:" + a1.getState());
		Util.sleep(1000);
		System.out.println("4:" + a1.getState());
	}
}
//the defalult 3 states of a thread is new , runnable and termintaed
