class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			System.exit(0);
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
//eventhough finally is there it won't execute, as the program terminates at exit(0)
