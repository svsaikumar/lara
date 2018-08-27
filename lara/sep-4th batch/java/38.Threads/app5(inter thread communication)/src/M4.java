class Test 
{
	 void test1()
	{
		System.out.println("from test-1 begin");
		synchronized (this)
		{
			try
			{
				wait();//when a1 is going to waiting state , it releases the lock and goes to waiting state
			}
			catch (InterruptedException ex)
			{
				System.out.println("from ex");
			}
		}
		System.out.println("from test-1 end");
	}
	
}
class A extends Thread
{
	Test obj;
	A(Test obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();//t1.test1();-a1 taking object lock of t1 and going inside test1
	}
}
class B extends Thread
{
	Test obj;
	B(Test obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();//t1.test1();-b1 taking object lock of t1 and going inside test1
	}
}
class M4
{
	public static void main(String[] args) //main thread calling only t1.wait but not t2.wait
	{
		Test t1 = new Test();
		A a1 = new A(t1);
		a1.start();
		B b1 = new B(t1);
		b1.start();
		Util.sleep(5000);
		System.out.println("main is calling test-2");
		synchronized (t1)
		{
			t1.notify();
		}
	}
}
