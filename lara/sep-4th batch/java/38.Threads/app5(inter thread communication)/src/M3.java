class Test 
{
	synchronized void test1()
	{
		System.out.println("from test-1 begin");
		try
		{
			wait();//when a1 is going to waiting state , it releases the lock and goes to waiting state
		}
		catch (InterruptedException ex)
		{
			System.out.println("from ex");
		}
		System.out.println("from test-1 end");
	}
	synchronized void test2()
	{
		System.out.println("from test-2 begin");
		notifyAll();//t1.notify();//this.notify();
		//notifyAll();//t1.notifyAll();//this.notifyAll()-re entereing into test1 as there is no ibejct lock and executing remaining portion of test1
		System.out.println("from test-2 end");
	}
}
class A extends Thread
{
	Test obj;
	A(Test obj)
	{
		this.obj = obj;//a1.obj = obj;
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
class M3
{
	public static void main(String[] args) //main thread calling only t1.wait but not t2.wait
	{
		Test t1 = new Test();
		Test t2 = new Test();
		A a1 = new A(t1);
		a1.start(); 
		A a2 = new A(t1);
		a2.start(); 
		B b1 = new B(t2);
		b1.start();
		Util.sleep(5000);
		System.out.println("main is calling test-2");
		t1.test2();//main thread calling only t1.wait but not t2.wait
		//t1.test2();//main thread calling only t1.wait but not t2.wait
		//t2.test2();//here it is calling t2 thread also
		System.out.println("done");
	}
}
//sharing same test obj to a1,b1
//a1,b1 going to wait state using t1.wait(), if someone calls t1 by using notifyall then a1,b1 wakeup again
