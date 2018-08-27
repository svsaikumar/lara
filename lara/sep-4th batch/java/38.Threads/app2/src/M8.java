class M8
{
	 static Thread getThread() 
	 {
		 return new Thread(new Runnable()
						{
							public void run()
							{
								for(int i = 1; i < 10; i++)
								{
									System.out.println("run:" + i);
								}
							}
						});
	 }
	 public static void main(String[] args)
	 {
		 Thread t1 = getThread();
		 t1.start();
		 for(int i = 10; i < 20; i++)
		 {
			System.out.println("main:" + i);
		 }
	 }
}
//thread object is creating  by supplying runnable type of 