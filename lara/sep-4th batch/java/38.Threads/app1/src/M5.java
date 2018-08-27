class A extends Thread
{
	public void start()//over riding run method
	{
		for(int i =1; i < 5; i++)
		{
			//System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}
class M5
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.start();
		A a2 = new A();
		a2.start();
		A a3 = new A();
		a3.start();
		for(int i = 40; i < 45; i++)
		{
			//System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}		
}
//here there are 3 child threads(for every Object one new thread is creating)
