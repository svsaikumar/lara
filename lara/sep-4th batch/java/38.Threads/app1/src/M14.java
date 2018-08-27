class A extends Thread 
{
	public void run()
	{



		for(int i = 1; i < 10; i++)
		{
			System.out.println(i + Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}
class M14
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.run();
		for(int i = 40; i<= 50; i++)
		{
			System.out.println(i);
			//System.out.println(i + Thread.currentThread().getName());
		}
	}
}
