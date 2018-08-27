class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			return;
		}
		try
		{
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
		catch (ArithmeticException ex) //throwable
		{	
			System.out.println(3);
			return;
		}

		finally
		{	
			System.out.println("from finally");
			
		}
		System.out.println("main end");
	}
}
//if control is going inside try then only finally will execute, otherwise it won't
