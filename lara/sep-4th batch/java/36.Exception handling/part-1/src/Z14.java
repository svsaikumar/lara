class Z14
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
		
		finally
		{	
			System.out.println("from finally");
			
		}
		System.out.println("main end");
	}
}
//even if there is no catch also, try-final will execute
//for try , there should be either catch or final(both also allowed)
//we can't keep try alone
//we can't keep catch alone
//we can't keep finally alone



/* try -catch
	try-catches
	try-finally
	try-catch- finally
	try-catches -finally
	*/