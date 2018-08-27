class M1 
{
	public static void main(String[] args) 
	{
		ThreadPoolManager tm = new ThreadPoolManager();
		tm.init();

		User1 u1 = new User1(tm);
		u1.start();

		User2 u2 = new User2(tm);
		u2.start();

		User3 u3 = new User3(tm);
		u3.start();
		
		Util.sleep(10000);

		tm.release();

		System.out.println("end of the game");
	}
}
//creating a thread and starting that thread  is a expensive operation
