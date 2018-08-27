class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;

		try
		{
			i = 10/0;
		}
		catch (ArithmeticException ex) //throwable
		{							   
			i = 20;
		}
		System.out.println("main end:" + i);
	}
	
}
//here we can use 'i' in entire main method
//if we want to use any variable inside try and inside catch declare that before try-catch