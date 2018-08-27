class Z10
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
			return;
		}

		finally
		{	
			System.out.println("from finally");
			
		}
		System.out.println("main end");
	}
}
////eventhough return is executing, finally also executing
//generally if return is executed control is handover to java command,
//if finally is there thenfinally executes before control is going to java command
