class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10;
			i = 10/0;
		}
		catch (ArithmeticException ex) //throwable
		{							   
			i = 20;
		}
		System.out.println("main end" + i);
	}
}
//here 'i' is declared  and initialized in try-so it is local to try only
//we can't use it outside of try
//similarly, catch members are also local to catch only.we can't use them outside of catch