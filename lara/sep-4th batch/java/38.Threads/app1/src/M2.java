class M2 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
		for(int i = 20; i <= 30; i++)
		{
			System.out.println(i);
		}
		System.out.println("done");
	}
}
//here also the 2 "for" loops are executing any main thread
//after executing the first for loop, then only second for loop is executed