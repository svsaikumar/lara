class A implements Runnable//Runnable is a interface is available inside java.lang.package
{
	int i = 10;
	public void run() 
	{
		for(int i = 0; i < 10; i++)
		{
			//System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A();//here thread is not creating .A is not subclass to thread. only obj to A is creating
		Thread t1 = new Thread(a1);//creating a object to thread by supplying runnable reference.supplying a1 to constructer
		t1.start();//internally it is calling a1.thread
		for(int i = 10; i < 20; i++)
		{
			//System.out.println(i);
			System.out.println(i + Thread.currentThread().getName());
		}
		System.out.println("done");
	}
}
//runnable interface conatains only one method.i.e run method
//single method interfaces are also called as functional interfaces
//runnable interface is also functional interface
//has a relationship