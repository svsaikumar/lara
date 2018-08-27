class O 
{
	public static void main(String[] args) 
	{
		try
		{
			int  i = 10;
			System.out.println(i);
		}
		catch (ClassNotFoundException ex )
		{
			System.out.println(ex);
		}
	}
}
//try-didn't have any class not found exception
//try can be empty  if every catch is unchecked
//try can't be empty if any one catch is checked