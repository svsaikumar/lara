class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x = 10/0;
		try
		{
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);

		}
		catch (ArithmeticException ex) //throwable
		{	
			System.out.println(3);
			int i = 10/0;
			System.out.println(4);
		}

		finally
		{	
			System.out.println("from finally");
			
		}
		System.out.println("main end:");
	}
}
//finally will exeute if control enters inside try
//if somethiing went wrong before try then finally block will not execute