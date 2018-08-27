class Shared 
{
	synchronized void test1(Shared obj) 
	{
		System.out.println("test-1 begin");
		Util.sleep(3000);
		obj.test2(this);
		System.out.println("test-1 end");
	}
	synchronized void test2(Shared obj) 
	{
		System.out.println("test-2 begin");
		Util.sleep(3000);
		obj.test1(this);
		System.out.println("test-2 end");
	}
}
class A extends Thread
{
	Shared s1,s2;
	A(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run()
	{
		s1.test1(s2);
	}
}

class B extends Thread
{
	Shared s1,s2;
	B(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run()
	{
		s2.test2(s1);
	}
}
class M9
{
	public static void main(String[] args)
	{
		Shared s1= new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1,s2);
		a1.start();
		Util.sleep(500);
		B b1 = new B(s1,s2);
		b1.start();
		System.out.println("1:" + a1.getState());
		System.out.println("2:" + b1.getState());
		System.out.println("end");
	}
}

