class A extends Thread
{

	ThreadLocal t1;
	A(ThreadLocal t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		System.out.println("1:" + t1.get());	
		t1.set(10);
		Util.sleep(500);
		System.out.println("3:" + t1.get());
		t1.set(20);
		Util.sleep(500);
		System.out.println("5:" + t1.get());
		t1.set(30);
		Util.sleep(500);
		System.out.println("7:" + t1.get());
		t1.set(40);
	}
}
class B extends Thread
{

	ThreadLocal t1;
	B(ThreadLocal t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		System.out.println("2:" + t1.get());	
		t1.set(50);
		Util.sleep(500);
		System.out.println("4:" + t1.get());
		t1.set(60);
		Util.sleep(500);
		System.out.println("6:" + t1.get());
		t1.set(70);
		Util.sleep(500);
		System.out.println("8:" + t1.get());
		t1.set(80);
	}
}

class M3 
{
	public static void main(String[] args) 
	{
		ThreadLocal t1 = new ThreadLocal();
		t1.set(90);
		A a1 = new A(t1);
		a1.start();
		Util.sleep(250);	
		B b1 = new B(t1);
		b1.start();
		Util.sleep(5000);
		System.out.println("9:" + t1.get());
	}
}
