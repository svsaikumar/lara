class M7
{
	 static Runnable getRunnable() 
	 {
		 return new Runnable()
						{
							public void run()
							{
								for(int i = 1; i < 10; i++)
								{
									System.out.println("run:" + i);
									System.out.println(i + Thread.currentThread().getName());
								}
							}
						};
	 }
	 public static void main(String[] args)
	 {
		 new Thread(getRunnable()).start();
		 for(int i = 10; i < 20; i++)
		 {
			System.out.println("main:" + i);
		 }
	 }
}
//r1 is a reference to runnable type
//r1 is pointing to subclass of runnable