












class B6
{
	int test() 
	{
		try
		{
			//several statements
			return 10;
			
		}
		catch (ArithmeticException ex)
		{
			return 20;	
		}
		return 30;

	}
}
//error: unreachable statement