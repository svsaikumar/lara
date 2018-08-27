








class AgeIsNegativeException extends ArithmeticException
{
	private AgeIsNegativeException()
	{

	}
	AgeIsNegativeException(String msg)
	{
		super(msg);
	}
}
//user defined exception class
//custom exception class
//whatever class we are defining that should be type of throwable(subclass to throwable)
//it is alwyays advisable to hava a constructer which supplys to super class