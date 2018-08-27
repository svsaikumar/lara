class Q 
{
	public static void main(String[] args) 
	{
		try
		{

			System.out.println(1);
			int i = 10/0;
			System.out.println(2);

		}
		catch (ArithmeticException ex) //throwable
		{							   
			System.out.println(ex.getMessage());
		}
		System.out.println("done");
	}
}
//here we are printing only the message of the exception(only the reason for exception)