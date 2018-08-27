class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");


		try
		{
			System.out.println(1);
			return;
		}
		catch (ArithmeticException ex) //throwable
		{	
			System.out.println(2);
		}

		finally
		{	
			System.out.println("from finally");
			
		}
		System.out.println("main end");
	}
}
//eventhough return is executing, finally also executing
//generally if return is executed control is handover to java command,
//if finally is there then it executes before control is going to java command
//