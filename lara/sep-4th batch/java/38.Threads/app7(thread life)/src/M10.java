class A extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);//0,1
			yield();
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);//0
			yield();
		}
	}
}

class M10 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		a1.start();
		b1.start();
		System.out.println("done");
	}
}
