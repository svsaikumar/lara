class  M19
{
	public static void main(String[] args) 
	{
		Runnable r1 = () -> 
		{
			for(int i = 1; i < 10; i++)
			{
				System.out.println("run" + i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i = 10; i < 20; i++)
		{
			System.out.println("run" + i);
		}
		System.out.println("done");
	}
}
//lambda expressions
//implementing run method of runnable using lambda
//r1 refering to runnable obj type
