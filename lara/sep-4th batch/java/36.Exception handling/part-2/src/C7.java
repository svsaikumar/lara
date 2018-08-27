











class C7
{
	int test() 
	{
		try
		{
			//several statements
		}
		catch (ArithmeticException ex)
		{
			
		}
		finally
		{
			return 30; 
		}
		return 10;
	}
}
//error: unreachable statement

