class A extends Thread 
{
	Shared s1;
	A(Shared s1)
	{
		this.s1 = s1;
	}
	public void run()
	{
		s1.test6();//statement-1
	}
}
