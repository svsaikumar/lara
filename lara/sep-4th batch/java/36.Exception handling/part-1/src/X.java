class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{

			int i = 10;
			i = 10/0;
		}
		catch (ArithmeticException ex) //throwable
		{							   
			ex = null;
		}
		System.out.println("main end" + ex);
	}
}
//here "ex" is argument to catch(i.e.,it is local to catch)
//we can't use it outside of catch