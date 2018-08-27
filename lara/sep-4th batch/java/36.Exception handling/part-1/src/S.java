class S 
{
	public static void main(String[] args) 
	{
		try
		{

			System.out.println(1);
			int i = 10/0;
			System.out.println(2);

		}
		catch (NullPointerException ex) //throwable
		{							   
			ex.printStackTrace();//here we should not use SOP
		}
		System.out.println("done");
	}
}
//here we will get arithmetic exception and there is no suitable catch to handle it so we get exception here
//java command will give all inforamation about the unhandled exception