class Z
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
		catch (ArithmeticException ex) //throwable
		{	
			System.out.println(3);
			int i = 10/0;
			System.out.println(4);
		}
		
		System.out.println("main end:");
	}
}
//if any exception occured inside catch then that exception is not handled by that catch itself
//multiple catches with same exception argument for one try is not allowed