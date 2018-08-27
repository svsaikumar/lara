class Shared 
{
	synchronized void test1(Shared obj) //holding s1 lock, it leaves lock when  test1 is completed
	{
		System.out.println("test-1 begin");
		Util.sleep(3000);
		obj.test2(this);//callin gtest2 on obj ->which is s2
		System.out.println("test-1 end");
	}
	synchronized void test2(Shared obj) //holding s2 lock,it leaves lock when  test2 is completed
	{
		System.out.println("test-2 begin");
		Util.sleep(3000);
		obj.test1(this);//calling test1 on obj ->which is s1
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
		s1.test1(s2);//calling test1 by using s1.a1 reqd obj lock of s1.taking obj lock of s2
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
		s2.test2(s1);//calling test2 by using s2.a1 reqd obj lock of s2.taking obj lock of s2
	}
}
class M2 
{
	public static void main(String[] args) throws Exception
	{
		Shared s1= new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1,s2);
		a1.start();
		Thread.sleep(500);
		B b1 = new B(s1,s2);
		b1.start();
		System.out.println("main end");
	}
}

