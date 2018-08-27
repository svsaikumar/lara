class M3
{




	public static void main(String[] args) 
	{
		Thread t1 = new Thread(() ->
		{
			Thread obj = Thread.currentThread();
			System.out.println("run-1:" + obj);
		});
		t1.start();


		Thread t2 = new Thread(() ->
		{
			Thread obj = Thread.currentThread();
			System.out.println("run-2:" + obj);
		});
		t2.start();
		Thread obj = Thread.currentThread();
		System.out.println("main:" + obj);
	}
}
//main thread is creating an object to thread class
//main thread only starting start
// internally it allocating  child thread to execute run method
//here totally 2 child threads are creating
//both child threads parent is main thread