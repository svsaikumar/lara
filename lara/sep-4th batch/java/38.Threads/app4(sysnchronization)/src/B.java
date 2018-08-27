class B extends Thread 
{
	Shared s1;
	B(Shared s1)
	{
		this.s1 = s1;
	}
	public void run()
	{
		s1.test5();//statement-2
	}
}
