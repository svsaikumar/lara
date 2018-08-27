class Z1
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
			try
			{
				System.out.println(4);
				int i = 10/0;
				System.out.println(5);
			}
			catch (ArithmeticException ex1) //throwable
			{	
				System.out.println(6);
			}
			System.out.println(7);
		}
		System.out.println("main end:");
	}


}
//we can provide try-catch anywhere
//inside catch body also we can provide try-catch
//inside try body also we can provide try-catch
