class M4
{
	public static void main(String[] args) 
	{
		



		Thread t1 = new Thread(() ->
		{
			Thread obj = Thread.currentThread();
			System.out.println("run-1:" + obj);
	
			Thread t2  = new Thread(() ->
				{
					Thread obj1 = Thread.currentThread();
					System.out.println("run-2:" + obj1);
			
				});
				t2.start();
		});
		t1.start();

		Thread obj = Thread.currentThread();
		System.out.println("main:" + obj);
	}
}