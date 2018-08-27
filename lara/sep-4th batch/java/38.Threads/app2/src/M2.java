class A implements Runnable//Runnable is a interface is available inside java.lang.package
{
	public void run() 
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println(i);
		}
	}
}
class M2
{
	public static void main(String[] args)//by using class A object we can create any number of threads.
	{
		A a1 = new A();//here thread is not creating .A is not subclass to thread. only obj to A is creating
		Thread t1 = new Thread(a1);//creating a object to thread by supplying runnable reference .supplying a1 to constructer
		t1.start();//internally it is calling a1.thread//a1.run
		Thread t2 = new Thread(a1);
		t2.start();//a1.run
		Thread t3 = new Thread(a1);
		t3.start();//a1.run//all 3 threads are sharing one class A object
		for(int i = 12; i < 15; i++)
		{
			System.out.println(i);
		}
		System.out.println("done");
	}
}
//runnable interface conatains only one method.i.e run method
//single mthod interfaces are also called as functional interfaces
//runnable interface is a functional interface

//has a relationship
//any threads can use one object of runnable type