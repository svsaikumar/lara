class M10 
{
	public static void main(String[] args) 
	{




		Thread main = Thread.currentThread();
		main.setPriority(6);
		

		Runnable r1 = () -> {
								System.out.println("from run");
								Thread t1 = Thread.currentThread();
								System.out.println(t1.getId());
								System.out.println(t1.getName());
								System.out.println(t1.getPriority());
								System.out.println(t1.isDaemon());
								System.out.println(main.getPriority());
							};
		Thread t1 = new Thread(r1, "my first thread");
		t1.setPriority(8);
		t1.start();
		System.out.println("done");
	}
}
//there are 2 ways to change default name
//				-setName method
//				-constructer
//we can change the main thread priority
//