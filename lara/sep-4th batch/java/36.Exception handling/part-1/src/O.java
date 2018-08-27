class O 
{
	public static void main(String[] args) 
	{
		try
		{

			System.out.println(1);
			int i = 10/0;//
			System.out.println(2);

		}
		catch (ArithmeticException ex)//throwable
		{							   //exception is handled in catch
			System.out.println(3);
		}
		System.out.println("done");
	}
}
//try should have a catch with one argument
//without catch we can't use try
//catch argument should be throwable data type
//whatever exceptions we saw till now all are subclass to throwable type
//mainly try try is for encorporating the abnormal conditions
//if there is no compatible catch flow will be terminating