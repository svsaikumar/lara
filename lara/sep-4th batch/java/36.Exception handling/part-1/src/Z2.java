class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(1);



		int i= 10/0;
		System.out.println(2);
		try
		{
			System.out.println(3);
		}
		catch (ArithmeticException ex) //throwable
		{	
			System.out.println(4);
		}
		System.out.println("main end:");
	}
}









//catch handles the exceptions which occured in try only
//exceptions which occured other than try is not handled by the catch
