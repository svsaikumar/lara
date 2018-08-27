class N 
{
	public static void main(String[] args) 
	{
		try
		{
			//int i = 10/0;
		}
		catch (ArithmeticException ex )
		{
			System.out.println(ex);
		}
		
	}
}
//unncessary try catch(we shulud have atleast one class not found exception to use try catfch here