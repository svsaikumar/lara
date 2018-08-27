








class B2 
{
	int test() 
	{
		try
		{
			//int i = 10/0;//several statements
			
		}
		catch (ArithmeticException ex)
		{
			return 20;
		}
		return 10;
		
	}
}
//for every possible flow there is a return value
