class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
				
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main end");
	}
}
//eventhough try having no statements compiler allow us to keep catch(as catch is unchecked exception)