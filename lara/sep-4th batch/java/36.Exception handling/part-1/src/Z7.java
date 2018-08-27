class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
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
//finally will execute for every execution no matter exeception rised or not
//no matter if exception is rised  which type of exception rised(it ignores)
//no matter whether rised exception is handled or not
//the flow is terminated after execting finally