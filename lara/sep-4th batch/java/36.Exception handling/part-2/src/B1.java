class B1 
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
	}
}
//for every possible flow there is a return value
