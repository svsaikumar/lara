class M2
{


	public static void main(String[] args) 
	{


		Thread t1 = new Thread(() ->
		{
			Thread obj = Thread.currentThread();//this is part is run method which we are not calling
			System.out.println("run:" + obj);//we are calling start method which internally calls run method with a new child thread
		});
		t1.start();
		Thread obj = Thread.currentThread();
		System.out.println("main:" + obj);
	}
}
//main thread allocating to execute main  method
//main thread creating obj to thread class
//through lambda we implemented run method
//while execution start method, it calls run method through child thread
//start method is taking care to allocate a thread to run method

/*
	main:Thread[main,5,main]
run:Thread[Thread-0,5,main]
   thread-0 is name of child thread
   main is parent
   */