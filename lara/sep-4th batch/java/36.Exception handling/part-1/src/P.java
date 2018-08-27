class P 
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
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
//raised exception is getting handled
//printing the exception only
//it advisable to print some information about the exception