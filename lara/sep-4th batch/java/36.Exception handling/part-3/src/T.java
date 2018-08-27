class T
{
	public static void main(String[] args) //throws ClassNotFoundException(we have to use this here) or try-catch
	{
		System.out.println("main begin");
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main end");
		
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}
//method can throw checked exception eventhough it didn't have such type of statements